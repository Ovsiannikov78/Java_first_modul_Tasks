package telran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter your first number: ");
        int num1 = Integer.parseInt(r.readLine());
        System.out.println("Please, enter your second number: ");
        int num2 = Integer.parseInt(r.readLine());

        nearestNumber(num1, num2);
    }


    public static int nearestNumber(int num1, int num2) {
        int a = 10;

        if (Math.abs(a - num1) < Math.abs(a - num2)) {         // Math.abs - обсолютное значение. Преобразует отриц. число в полож.
            System.out.println("Nearest number to number 10 is: " + num1);

        } else if (Math.abs(a - num1) > Math.abs(a - num2)) {
            System.out.println("Nearest number to number 10 is: " + num2);

        } else {
            System.out.println("Both numbers are located at the same distance from the number 10.");
        }
        return 0;
    }
}
