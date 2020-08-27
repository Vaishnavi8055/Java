package Series;/*
 * Created by Vaishnavi Chaurasia
 * 28-Aug-20
 * 8:16 AM
 * Java
 */

public class RecursiveMethod {

    static int fibonacci(int term) {
        if (term <= 1) {
            return term;
        }
        return fibonacci(term - 1) + fibonacci(term - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}
