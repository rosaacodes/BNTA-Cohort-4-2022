package JavaI.ArraysConditionalsMethods;

public class Exercise2 {

    /*
    Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
    You might compile and run the program via command line or by editing configuration and pass program arguments
  */
    public static void main(String[] args) {

        String input = "   b ri   ght net   work  ";
        input = input.replace(" ", "");
        // removing all spaces

        int nIndex = input.indexOf("n");
        // There is only one "n" so let's target that to introduce the space (as opposed to 2 "t"s)

        String inputWithSpace = input.substring(0, nIndex) + " " + input.substring(nIndex, input.length());
        // adds in a space before the index that we found previously (note that the substring method excludes the index specified)

        String[] wordArray = inputWithSpace.split(" ");
        // creating an array as easiest to iterate over

        String result = "";
        // initialise a result variable that we can add to

        for (String word : wordArray) {
            char firstLetter = word.charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);
            // grabs the first letter and then capitalises it

            String capitalisedWord = firstLetter + word.substring(1);

            result += capitalisedWord;
            // adds the words into our result String
            result += " ";
            // adds in a space after each word
        }

        result = result.trim();
        // removes the extra (trailing) space added in the `for` loop (after "Network")

        System.out.println(result);
    }
}



