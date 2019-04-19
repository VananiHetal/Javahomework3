public class Total_number_of_a {

    //WAP to enter any string and count total number of 'a' in that string.

    public static void main(String[] args){
        String input = "analiyanana";
        int charCount = 0;
        int b = 0;
        for (b=0; b<input.length(); b++ ) {
            if
            (input.charAt(b) == 'a') {
                charCount++;
            }
            }

            System.out.println("count of character 'a' on String is "  + charCount);

    }

}
