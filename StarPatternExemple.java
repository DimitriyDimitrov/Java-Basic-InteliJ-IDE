package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 20; j++) {
                System.out.print("*");
                if (j == i * 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 20; j++) {
                System.out.print("*");
                if (j == i * 2) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();

        for (int i = 20; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
