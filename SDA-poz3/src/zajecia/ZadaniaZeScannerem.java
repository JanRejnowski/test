package zajecia;

import java.util.Scanner;

public class ZadaniaZeScannerem {
    public static void main(String[] args) {
//        max();
        isEven();
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int number = scanner.nextInt();
        System.out.println("Insert second number: ");
        int number2 = scanner.nextInt();
        if (number > number2) {
            System.out.println("First number is bigger");
        } else if (number == number2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Second number is bigger");
        }
    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
