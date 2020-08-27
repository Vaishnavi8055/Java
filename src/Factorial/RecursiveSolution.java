package Factorial;/*
 * Created by Vaishnavi Chaurasia
 * 27-Aug-20
 * 21:24 PM
 * Java
 */

public class RecursiveSolution {
    static int Factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * Factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4 = "+Factorial(4));
    }
}

// number = 4
 /* Step 1 :-  4==0 ---> false
               4*Factorial(3)

    Step 2 :-  3==0 ---> false
               4*3*Factorial(2)

    Step 3 :-  2==0 ---> false
               4*3*2*Factorial(1)

    Step 4 :-  1==0 ---> false
               4*3*2*1
               return 24
*/