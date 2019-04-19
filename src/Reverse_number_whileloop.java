import java.util.Scanner;

public class Reverse_number_whileloop {

    //WAP for input number and reverse it and print it using while loop

    //main method
    public static void main(String[] args) {
        int num =0; int reversenum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number"); // num = 5689
        num = scanner.nextInt();

        while (num != 0) {

            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of input number is" +reversenum);

    }
    }




