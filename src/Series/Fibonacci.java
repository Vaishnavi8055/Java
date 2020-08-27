package Series;/*
 * Created by Vaishnavi Chaurasia
 * 28-Aug-20
 * 23:18 PM
 * Java
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N'th Term of Series");
        int term = scanner.nextInt();

        // Fibonacci Series = 0 1 1 2 3 5 8......n (term)
        //                    0 1 0+1 1+1 1+2 3+2...........n

        int seriesArray[] = new int[term];
        seriesArray[0] = 0;
        seriesArray[1] = 1;

        for (int i = 2; i < term; i++) {
            seriesArray[i] = seriesArray[i - 1] + seriesArray[i - 2];

        }
        for (int i = 0; i < term; i++) {
            System.out.print(seriesArray[i] + " ");
        }
    }
}
