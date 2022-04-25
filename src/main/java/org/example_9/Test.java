package org.example_9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Comparator;

/** Main class for operations
 * Initial file.txt = file to get information
 * FinalFile.txt = results
 */
    public class Test {
        public static void main(String[] args) throws IOException {
            String month = "02";

            Files.lines(Paths.get("InitialFile.txt"))
                    .map(line -> line.split(","))                                   // Split to [name, surname, birth]
                    .filter(parts -> parts[2].split("\\.")[1].equals(month))        // Removing all people with wrong birth month
                    .sorted(Comparator.comparing(p -> p[0]))                              // Sorting by name
                    .map(parts -> new String[]{parts[0], parts[1]})                       // Replace [name, surname, birth] to [name -- surname]
                    .forEach(parts -> {
                        try {
                            Files.write(
                                    Paths.get("FinalFile.txt"),
                                    Collections.singleton(String.join(",", parts)),
                                    StandardOpenOption.APPEND, StandardOpenOption.CREATE
                            );
                        } catch (Exception ignored) {}
                    });
        }
    }

