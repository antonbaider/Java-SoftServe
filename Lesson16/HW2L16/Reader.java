// A file with java code is given.
// Read program text from file and all words public in the declaration of class attributes and methods should be replaced with the word private.
// Save the result to another previously created file.

import java.io.*;
public class Reader {
    public static void main(String[] args) {
        String originalFile = "someFile.txt";
        String newFile = "newFile.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            StringBuilder codeBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                codeBuilder.append(line).append("\n");
            }
            reader.close();
            String newCode = codeBuilder.toString().replaceAll("public\\s+(\\w+)", "private $1");
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.write(newCode);
            writer.close();
            System.out.println("++++++++++++++++++++");
            System.out.println("Well done");
            System.out.println("++++++++++++++++++++");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

