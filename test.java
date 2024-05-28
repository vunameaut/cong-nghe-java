package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner previousReadingScanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện cũ: ");
        int previousReading = previousReadingScanner.nextInt();

        Scanner currentReadingScanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện mới: ");
        int currentReading = currentReadingScanner.nextInt();

        int unitsConsumed = currentReading - previousReading;
        double billAmount = 0;

        if (unitsConsumed <= 50) {
            billAmount = unitsConsumed * 1678;
        } else if (unitsConsumed <= 100) {
            billAmount = 50 * 1678 + (unitsConsumed - 50) * 1734;
        } else if (unitsConsumed <= 200) {
            billAmount = 50 * 1678 + 50 * 1734 + (unitsConsumed - 100) * 2014;
        } else {
            billAmount = 50 * 1678 + 50 * 1734 + 100 * 2014 + (unitsConsumed - 200) * 2536;
        }

        double totalAmount = billAmount + (billAmount * 0.1);

        System.out.println("Total electricity bill: " + totalAmount);
    }
}