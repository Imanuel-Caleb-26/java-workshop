package com.java.workshop.standardlib;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class WordCounter {

    private static int countWordsInFile(Path filePath) {
        try (Stream<String> lines = Files.lines(filePath)) {
            return lines
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .filter(word -> !word.isEmpty())
                    .mapToInt(w -> 1)
                    .sum();
        } catch (IOException e) {
            System.err.println("Error reading file: " + filePath);
            return 0;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        // Folder containing text files
        Path dirPath = Paths.get("textfiles");

        // Get all text files in the directory
        List<Path> files = Files.walk(dirPath)
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(".txt"))
                .toList();

        // Thread pool to run tasks concurrently
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit a task for each file
        List<Future<Integer>> futures = files.stream()
                .map(file -> executor.submit(() -> countWordsInFile(file)))
                .toList();

        // Combine results
        int totalWords = 0;
        for (Future<Integer> future : futures) {
            totalWords += future.get(); // waits for each thread to complete
        }

        executor.shutdown();

        System.out.println("Total word count across files: " + totalWords);
    }
}

