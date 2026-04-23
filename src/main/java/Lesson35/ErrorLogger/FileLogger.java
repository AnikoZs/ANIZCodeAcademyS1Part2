package Lesson35.ErrorLogger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message, LogLevel level) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("[" + level + "] " + message + "\n");
        } catch (IOException e) {
            System.out.println("Could not write to log file!");
        }
    }
}