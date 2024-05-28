package test;

import java.util.Scanner;

public class uc_bc {
    public static void main(String[] args) {

        System.out.println("nhap vao so a :");
        Scanner scannera = new Scanner(System.in);
        int a = scannera.nextInt();

        System.out.println("nhap vao so b :");
        Scanner scannerb = new Scanner(System.in);
        int b = scannerb.nextInt();

        int c = a * b;

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b = b - a;
            }

        }
        System.out.println("UCLN= " + a);
        System.out.println("BCNN= " + (c / a));

    }
}
