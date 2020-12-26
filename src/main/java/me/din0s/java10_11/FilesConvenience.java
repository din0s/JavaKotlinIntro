package me.din0s.java10_11;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class FilesConvenience {
    public static void main(String[] args) throws IOException {
        var path = FileSystems.getDefault().getPath("file.txt");

        // writing - works even if the file doesn't exist!
        Files.writeString(path, "hello world");

        // reading
        var allLines = Files.readString(path);
        System.out.println(allLines);
    }
}
