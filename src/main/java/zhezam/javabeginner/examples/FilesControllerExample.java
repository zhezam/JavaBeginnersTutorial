package zhezam.javabeginner.examples;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Евгения on 02.11.2017.
 */
public final class FilesControllerExample {

    public static String filesPath = "src\\main\\resources\\";
    public static String extension = "txt";

    /*
      * Read file with
      * java < 7
      * 1
      */
    public static ArrayList<String> scannFile (String fileName) {

        ArrayList<String> resultArray = new ArrayList<String>();

        File file = new File(filesPath + fileName + "." + extension);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                resultArray.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.toString());
        }
        catch (IOException e) {
            System.out.println("Can't read file " + e.toString());
        }
        finally {
            try {
                scanner.close();
            }
            catch (NullPointerException e) {
                System.out.println("Scanner is null: " + e.toString());
            }
        }

        return resultArray;
    }

    /*
     * Read file with
     * java < 7
     * 2
     */
    public static ArrayList<String> readFileOld (String fileName) {

        ArrayList<String> resultArray = new ArrayList<>();

        File file = new File(filesPath + fileName + "." + extension);

        FileReader reader = null;
        try {
            reader = new FileReader(file);

            BufferedReader buffer = new BufferedReader(reader);

            String line = null;
            while ((line = buffer.readLine()) != null) {
                resultArray.add(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.toString());
        }
        catch (IOException e) {
            System.out.println("Can't read file " + e.toString());
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException e) {
                System.out.println("Can't close file " + e.toString());
            }
            catch (NullPointerException e) {
                System.out.println("Reader is null: " + e.toString());
            }
        }

        return resultArray;
    }


    /*
     * Read file with
     * java 7
     * 2
     */
    public static ArrayList<String> readFile (String fileName) {

        ArrayList<String> resultArray = new ArrayList<>();

        File file = new File(filesPath + fileName + "." + extension);

        try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = buffer.readLine()) != null) {
                resultArray.add(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.toString());
        }
        catch (IOException e) {
            System.out.println("Can't read file " + e.toString());
        }

        return resultArray;
    }


    /*
     * Append file with
     * java 7
     */
    public static void appendFile (String fileName, String expression) {

        File file = new File(filesPath + fileName + "." + extension);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(expression);
            writer.newLine();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.toString());
        }
        catch (IOException e) {
            System.out.println("Can't write file " + e.toString());
        }
    }
}
