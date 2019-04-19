import java.util.Scanner;

public class Fibonacci_series {

    //WAP to pint fibonacci series of n terms where n is input by user
    // fabonacci series = 1 1 2 3 5 8 13 21 ....
    public static void main(String[] args) {
        int  c = 0, n; //  where n is 30
        Scanner scannerr = new Scanner(System.in);
        System.out.println("Enter a number to get fibonacci series upto n th term");
        n = scannerr.nextInt();
        int a = 0;
        int b = 1;

        while (c <= n) {
            a = b; // condition
            b = c;
            c = a + b;

            System.out.println("fibonacci series upto n is " + c);
            //System.out.println("Fibonacci series upto " + n + " is ;-");
        }
    }

}