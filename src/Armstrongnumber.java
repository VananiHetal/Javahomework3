public class Armstrongnumber {


    //WAP to input any number and check if it is Armstrong number or not.
    // check 153 number is Armstrong number or not.
    //153  ==   1       5     3 (isolate the number)
    //        1*1*1 +  5*5*5 + 3*3*3 (find cube of each numbers and add each number )
    //          1   +   125  +  27
    public static void main(String[] args){

        int a = 153; //this is the number to check
        int c = 0;
        int m;  // creat variable. to give value of 3.
       int temp = a; // creat new varibale to keep value of "a"

        while (a>0)
        {
            m = a % 10; // will give value of 3 only
            a = a / 10; // this method removed 3 and remain 15
            c = c + m * m * m;  // 3*3*3
        }
        if (temp==c)
           System.out.println("It is an Armstrong number");
       else
           System.out.println("It is not Armstrong number");
       }

}
