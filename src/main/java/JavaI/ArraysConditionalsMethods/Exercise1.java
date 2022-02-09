package JavaI.ArraysConditionalsMethods;

public class Exercise1 {

    public static void main (String[] args){

        String word = "Rosalinda";
        /*
          Write a method that reverses any String and print to console
          Input should be a string
          Output should be reversed input
        */

        String reversedString = "";

        for (int i = word.length(); i > 0; i--) {
            reversedString += word.charAt(i-1);
        }

        System.out.println(reversedString);


    }
}