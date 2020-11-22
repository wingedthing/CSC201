/**
 * @author John Sfara
 * @version 1.0
 * @since   2020-11-06
 * CSC.201.DL03
 *
 * This program produces a bar chart of gourmet-popcorn production for
 * a cooperative farm group on a farm-by-farm basis.
 */

import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class Popcorn {

    public static void main(String[] args) {
        // get file from user
        Scanner fromKey = new Scanner(System.in);
        System.out.println("Enter a valid file name");
        String fileName = fromKey.nextLine();
        BufferedReader br = null;
        // read file line by line.
        try {
            String strLineFromFile;
            br = Files.newBufferedReader(Paths.get(fileName));
            typeHead();
            while((strLineFromFile = br.readLine()) != null) {
                parseData(strLineFromFile);
            }

        }catch (IOException exp) {
            System.out.println("Not a valid file");
        }

        fromKey.close();
    }

    /** typeHead() prints to console a formated graph heading. */
    public static void typeHead() {
        System.out.printf("%32s %n%n", "Popcorn Co-op");
        System.out.printf("%53s %n", "Production in Hundreds  ");
        System.out.printf("%53s %n", "of Pint Jars per Acre   ");
        System.out.printf("Farm Name" + "%44s %n", "   1   2   3   4   5   6");
        System.out.printf("%53s %n", "---|---|---|---|---|---|");
    }

    /** parseData() takes as input a String line of text from the file.
     * It parses the name and num values from the line and calculates the 25 jars per Acre.
     * Then calls the row() function */
    private static void parseData(String line) {
        String farmName;
        double acres;
        int pintJars;
        int jarsPerAcre;
        String [] words = line.split(",");
        String [] nums = words[1].split("\\s+");
        farmName = words[0];
        acres = Double.valueOf(nums[1]);
        pintJars = Integer.valueOf(nums[2]);
        jarsPerAcre = (int)Math.floor((pintJars / (acres * 1.0) / 25.0));
        row(farmName, jarsPerAcre);
    }

    /** row() takes as input the farmName and jarsPerAcre arguments from parseData().
     * It creates a String stars of "*" chars based on the amount of jarsPerAcre.
     * prints and formats the farmName and stars. */
    public static void row(String farmName, int jarsPerAcre) {
        String stars = "";
        String spacesAndBar = "";
        for(int i = 1; i <= jarsPerAcre; i++) {
            if(i == 16) {
                stars += "#";
            }else {
             stars += "*";
            }
        }
        if(jarsPerAcre < 16) {
            int spaces = 16 - jarsPerAcre;
            for(int i = 1; i < spaces; i++) {
                spacesAndBar += " ";
            }
            spacesAndBar += "|";
            stars += spacesAndBar;
        }
        System.out.printf("%-28s %s %n", farmName, stars );
    }
}
