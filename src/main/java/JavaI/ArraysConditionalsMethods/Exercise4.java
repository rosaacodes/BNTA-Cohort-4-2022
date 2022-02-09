package JavaI.ArraysConditionalsMethods;

import java.util.ArrayList;

public class Exercise4 {

    public static void main(String[] args) {

        /*
          Write a program that takes an input number from the console and prints if number is prime
          Create a method to check if number is prime then use against the input
        */
        ArrayList<Integer> primeList = new ArrayList<>() {
            {
                add(2);
            }
        };
        /* Since we don't know the size of the input (and hence the number of prime numbers less than that)
        we can't use an Array. This funky syntax is us declaring and initialising our ArrayList */

        int inputNumber = 0;
        for (int i = 3; i <= inputNumber; i++) {
            // Note: starts at 3 as all 2 is the first prime number (number must be divisible by only 1 AND itself)
            // "for every number from 3 up to the value provided..."
            Boolean isPrime = true;
            for (int j = 0; j < primeList.size(); j++) {
                // "... and for every prime number we currently have in our array list"
                // "divide our current number by every prime in the list"
                // "if it is divisible by a number, change the "isPrime" boolean to `false`
                /* nice-to-have: "if it is found to be divisible by a number and is the input number provided, print
                the numbers it is divisible by" */
                if (i % primeList.get(j) == 0) {
                    isPrime = false;
                    if (i == inputNumber) {
                        System.out.println("Divisible by: " + primeList.get(j));
                    }
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
        }

        System.out.println("Your input was: " + inputNumber);
        if (primeList.contains(inputNumber)) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }


    }

}