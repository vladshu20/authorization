package by.bntu.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CredsReader {
    public static List<String> readLogPass(String fileName) throws IOException {
//        FileInputStream fis = new FileInputStream("");
//         = "C:\\Users\\Uladzislau_Shumchyk\\IdeaProjects\\authorization\\lp.txt";
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

        return allLines;
    }
}
