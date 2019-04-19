public class Primenumber {

    //WAP to input any number and check it it Prime number or not.
    // Prime numbers are only divisible by 1 or themselves.

    public static void main(String[] args) {

        int i = 11; // this is the number to check if it is prime number or not
        int m = 4; // non prime number
        boolean temp = false; //   this variable will determine false condition

        // conditon for non prime number
        for (m = 4; m <= i / 4; ++m) {
            if (i % m == 0) {
                temp = true; //  this variable determine true condition
                break; //  variable to break loop if first condition is true
            }
        }
        if (!temp)
            System.out.println(i + " is a prime number.");
        else
            System.out.println(i + "is not a prime number.");
    }
}