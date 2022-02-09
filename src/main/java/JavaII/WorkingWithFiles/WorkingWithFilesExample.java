package JavaII.WorkingWithFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFilesExample {

    public static void main(String[] args) throws IOException {
        // create file
        File file = new File("src/hello.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("hello");

        // once you are done writing to the file
        printWriter.flush();
        printWriter.close();

        // read example
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}

