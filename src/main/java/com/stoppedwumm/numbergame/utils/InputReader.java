package com.stoppedwumm.numbergame.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    public InputReader() {
    }

    /**
     * Reads a line of input from the user, prefixed by the given prompt.
     * @param Prompt The prompt to print to the user.
     * @return The line of input entered by the user.
     * @throws IOException If something goes wrong while reading the input.
     */
    public static String ReadInput(String Prompt) throws IOException {
        System.out.print(Prompt + " ");
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String s = r.readLine();

        // Printing the read line
        return s;
    }
}
