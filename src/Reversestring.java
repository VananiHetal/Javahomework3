import java.util.Scanner;

public class Reversestring {

    // WAP called reversestring which print the reverse string
    //enter abcdef output will look like reverse string  fedcba
    public static void main(String[] args) {
        String str; // string variable
        Scanner scanner = new Scanner(System.in);// creat a object put value of string
        System.out.println("Enter a string ;");// abcdef
        str = scanner.nextLine();
       // System.out.println("Reverse of a String '" + str + "' is :");
        for (int a = str.length(); a > 0; --a) // For loop iterates from a=length of the string to a>0.
        {
            System.out.println(str.charAt(a - 1));
        }
    }
}
