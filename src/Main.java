import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The name of the file the user chose to process
        //Number of lines in the file
        //Number of words in the file
        //Number of characters in the file
        //open the file
        try {
            JFileChooser choice = new JFileChooser();

            choice.showSaveDialog(null);

            File openedFile = choice.getSelectedFile();
            Scanner reader = new Scanner(openedFile);
            int numLines = 0;
            int numWords = 0;
            int numChar = 0;
            //read each line (one at a time)
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] lineArr = line.split(" ");
                // add items per line
                numLines++;
                numWords += lineArr.length;
                numChar+= line.length();
            }
            reader.close();
            //print info
            System.out.println("You chose to open the file " + openedFile.getName());
            System.out.println("In your file there are " + numLines + " lines, "
                    + numWords + " words, and " + numChar + " characters");
        } catch (FileNotFoundException e) {
        System.out.println("An error occurred with the file you picked");
        e.printStackTrace();
    }











    }
}