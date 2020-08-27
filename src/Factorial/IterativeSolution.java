package Factorial;/*
 * Created by Vaishnavi Chaurasia
 * 28-Aug-20
 * 8:47 PM
 * Java
 */

import java.util.Scanner;

public class IterativeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        // Factorial of a number
        // number = 4 factorial = 4*3*2*1 = 24
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " = " + fact);

    }
}
