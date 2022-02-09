package JavaII.UserInputScannerClass;

import java.util.Scanner;

public class ScannersExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = scanner.nextLine();

        Scanner scannerTwo = new Scanner(System.in);
        System.out.println("Enter your birthday month");


        String birthdayMonth = scannerTwo.nextLine();
        System.out.println("Username is: " + userName);
        System.out.println("Born in: " + birthdayMonth);

    }
}
