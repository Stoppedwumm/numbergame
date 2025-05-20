package com.stoppedwumm.numbergame;

import java.io.IOException;
import java.util.Random;

import com.stoppedwumm.numbergame.utils.InputReader;
//import com.stoppedwumm.numbergame.utils;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("Welcome to my number guessing game");
        System.out.println("You'll have to guess a number between 1 and 100!");
        System.out.println("or if you wanna quit just type quit");
        while (true) {
            String inp = InputReader.ReadInput("Input your guess:");
            if (inp.equals("quit")) {
                System.out.println("Quit");
                System.exit(0);
            }
            try {
                Integer inpNumber = Integer.parseInt(inp);
                if (inpNumber > numberToGuess && inpNumber > 0) {
                    System.out.println("Too big!");
                    numberOfTries++;
                } else if (inpNumber < 0) {
                    System.out.println("very funny");
                } else if (inpNumber < numberToGuess) {
                    System.err.println("Too small!");
                    numberOfTries++;
                } else {
                    System.err.println("Correct number guessed!");
                    hasGuessedCorrectly = true;
                    numberOfTries++;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }
        if (hasGuessedCorrectly) {
            System.out.println(String.format("You won in %s tries!", numberOfTries));
        } else {
            throw new Error("Broken logic");
        }
    }
}
