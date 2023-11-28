package com.MachineProblem4;

import java.util.Scanner;

public class MachineProblem4 {
    // ? Your source code must have: Minimum of 2 Constant Variable, Minimum of 1
    // ? try...catch block, Minimum of 2 loops.

    // TODO MINIMUM OF 2 CONSTANT VARIABLE
    private static final int MIN_INPUT = 1;
    private static final int MAX_INPUT = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // TODO Create a simple application that can accept a number from user.
        do {
            try {
                System.out.print("Please enter a number: ");
                number = Integer.parseInt(scanner.nextLine());

                /*
                 * If input is less than 1 or greater than 50, display
                 * this error message "INPUT SHOULD BE WITHIN 1-50" then request again for
                 * another input.
                 */

                if (number < MIN_INPUT || number > MAX_INPUT) {
                    System.out.println("INPUT SHOULD BE WITHIN " + MIN_INPUT + "-" + MAX_INPUT);
                }
                // TODO In case input is not a number, display this error message
                // TODO "INPUT SHOULD BE A NUMBER!!" then request again for another input.

            } catch (NumberFormatException e) {
                System.out.println("INPUT SHOULD BE A NUMBER!!");
                number = -1;
            }
        } while (number < MIN_INPUT || number > MAX_INPUT);

        // Print the pattern
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == number) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k <= i - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}