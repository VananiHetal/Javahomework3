import java.util.Scanner;

public class Sum_of_digit {

    // WAP to input five digit and find sum of each digit
    //main method
   public static void main(String[] args)
     {
          int num, Reminder, Sum = 0; // 3 variable needed for calculation of sum

         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number"); // Enter 8888 numberain
        num = scanner.nextInt();

             while (num > 0) {
                 Reminder = num % 10;   //This method adds the remainder to sum and n=n/10,
                 Sum = Sum + Reminder;  // these 2 steps will repeat until num!=0. If num=0 then it returns the sum value.
                 num = num / 10;
             }
                 System.out.println("Sum of the digits of Given number is" + Sum);


             }
        }



