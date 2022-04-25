package org.example_9;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {
    @Test
    public void testJava() throws IOException {
        assertEquals("name2,surname2\nname4,surname4\n", Files.readString(Path.of("C:\\Programming Java\\JavaWork\\FinalFile.txt")));
    }
}


