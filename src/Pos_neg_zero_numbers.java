import java.util.Scanner;

public class Pos_neg_zero_numbers {

    //WAP to enter the numbers till the user wants and at the end it should be display the count of
    // positive,negative and zeros.
    //main method

    public static void main(String[] args){

       int number,
       countPositive= 0,countNegative = 0,countZero = 0;

       char choice;
       do {
           Scanner scanner = new Scanner(System.in);    // scanner class to read value
           System.out.println("Enter any intger numbers");
           number = scanner.nextInt();

           if (number>0) {
               countPositive++;
           }
           else if(number<0){
               countNegative++;
           }
            else{
                countZero++;
           }

           System.out.print("Do you want to continue y/n? ");
           choice =scanner.next().charAt(0);

       }while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }




}


