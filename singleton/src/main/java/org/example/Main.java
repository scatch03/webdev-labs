package org.example;

import org.example.api.FileSystem;
import org.example.api.FileSystemType;
import org.example.implementation.FileManager;

import java.io.File;

import static org.example.api.FileSystemType.AWS;

public class Main {
    public static void main(String[] args) {
        final FileSystem fs = FileManager.getInstance().getFileSystem(AWS);
        final String uri = fs.put(new File(""));
        final File file = fs.get(uri);
        fs.delete(uri);
    }
}
