import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

//Create file1.txt file with a text about your career.
//Read context from file into array of strings. Each array item contains one line from file.
//Write in to the file2.txt
//   1) number of lines in file1.txt.
//   2) the longest line in file1.txt.
//   3) your name and birthday date.
public class Txt {
    public static final String text = """
            This is my small CV
            Hello guys! My name is Anton Baider.
            And nowadays, I'm a student of JavaFundamentals =)
            """;

    public static void main(String[] args) throws IOException {
        String filename = "file1.txt";
        var file = new File(filename);

        Files.writeString(file.toPath(), text);
        try (var bw = Files.newBufferedWriter(Path.of(filename)
        )) {
            bw.write(text);
        }
        String[] lines = Files.lines(Path.of(filename))
                .toArray(String[]::new);
        for (var line : lines) {
            System.out.println(line.length() + " : " + line);
        }
        var stat = Arrays.stream(lines)
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println("__________________________________________");
        System.out.println("Max line consist of " + stat.getMax() + " characters:");
        var maxLine = Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(maxLine);
        System.out.println("__________________________________________");
        System.out.println("Adding my name and birthday date");
        Writer fileadd;
        fileadd = new BufferedWriter(new FileWriter(filename, true));
        fileadd.append("Anton, 04/26/90");
        fileadd.close();
        System.out.println("__________________________________________");
        System.out.println("Done");
        System.out.println("__________________________________________");

        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        while(line != null)
        {
            System.out.println(line);
            line = in.readLine();
        }
        in.close();
    }
}