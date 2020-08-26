package Swapping;/*
 * Created by Vaishnavi Chaurasia
 * 26-Aug-20
 * 22:57 PM
 * Java
 */

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 45;

        System.out.println("Before Swapping :-");
        System.out.println("number1 = " + number1 + " && number2 = " + number2);

        // Swapping of Two Variables

        int temporaryVariable = number1;
        number1 = number2;
        number2 = temporaryVariable;

        System.out.println("After Swapping :- ");
        System.out.println("number1 = " + number1 + " && number2 = " + number2);

    }
}
