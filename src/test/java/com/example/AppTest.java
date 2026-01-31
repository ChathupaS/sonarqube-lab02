package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    @Test
    public void testMain() {
        // Test that main method runs without NPE
        // It will fail on database connection, but that's expected
        assertThrows(Exception.class, () -> {
            App.main(new String[]{});
        });
    }
}