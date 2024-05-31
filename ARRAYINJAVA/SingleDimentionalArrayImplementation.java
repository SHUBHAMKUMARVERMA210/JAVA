package ARRAYINJAVA;

import java.util.Scanner;

public class SingleDimentionalArrayImplementation {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 integers:");

        // Loop to take input from the user
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The elements of the array are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
