package JavaIIExercises;

public class Exercise4 {

    /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */

    public static void  main (String[] args) {

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] ourArray = input.split(", ");
        double[] doubleArray = new double[ourArray.length];

        double total = 0;

        for (String numString : ourArray) {
            double numDouble = Double.parseDouble(numString);
            total += numDouble;


        }

        System.out.println(total);









    }
}
