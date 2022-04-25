package org.example_9;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Testing {
    @Test
    public void testJava() throws IOException {
        String s = Files.readString(Path.of("C:\\Programming Java\\JavaWork\\FinalFile.txt"));

    }
}


