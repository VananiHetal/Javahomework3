import java.util.Scanner;

public class Multi_table_of_5 {

    //Print single multiplication  table using do while loop for given number.
    // i.e.=5 time table

    //main method
    public static void main(String[] args) {
        int num; // num = 5
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number");
        num = scanner.nextInt();
        int i = 1;                 // i = number 1 to 10

        do {
            i++;

            System.out.println(num + " x " + i + " = " + num * i);

        } while
        (i < 10) ;

    }
    }


