import java.util.Scanner;

public class Muti_table5_forloop {

    //WAP to print multiplication table using for loop for given number
    // given number is 5
    // main method
    public static void main(String[] args){
        int num;  // num =5
        int i ;
         Scanner scanner= new Scanner(System.in);
         System.out.println(" Enter the number");
         num = scanner.nextInt();

          for (i= 1; i<=10; i++ ) // condition and i = 1 to 10 number
          System.out.println(num + " * " + i + " = " + (num*i)) ;
    }
}
