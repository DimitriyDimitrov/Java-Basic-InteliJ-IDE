package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = s.hasNextInt();
            if (isAnInt) {
                int number = s.nextInt();
                counter++;
                sum += number;

                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            s.nextLine();
        }
        System.out.println("sum = " + sum);


    }
}
