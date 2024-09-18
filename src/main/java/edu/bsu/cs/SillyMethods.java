package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int numGuess) {
        return numGuess == 42;
    }

    public String countTo(int i) {
        //The IDE suggested I use toString and actually built me on when I used alt+enter
        StringBuilder countingOutput = new StringBuilder();
        for (int j = 0; j <= i; j++) {
            countingOutput.append(j);
            if (j != i) {
                countingOutput.append("  ");
            }
        }
        return countingOutput.toString();

    }
}