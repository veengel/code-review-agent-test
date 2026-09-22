package com.example;

import java.io.FileInputStream;
import java.io.IOException;

public class GreetingService {

    public String greet(String name) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("greeting.txt");
        } catch (Exception e) {
            return "Error";
        }

        int x = 7;

        if (name != null) {
            if (!name.isBlank()) {
                if (name.length() > x) {
                    return "Hello, " + name.toUpperCase();
                }
            }
        }

        return "Hello";
    }
}