/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Sachin Mishra
 */

package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double tax = 0.055; //5.5% tax
        double subtotal = 0.0;

        for(int i = 0; i < 3; i++) {
            System.out.printf("What is the price of item %d? ", i+1);
            int price = input.nextInt();

            System.out.print("How many are you purchasing? ");
            int quantity = input.nextInt();

            subtotal += price * quantity;
        }

        System.out.println();
        System.out.printf("Subtotal: $%.2f%n", subtotal);

        double taxamount = subtotal * tax;
        System.out.printf("Tax: $%.2f%n", taxamount);

        subtotal += taxamount;
        System.out.printf("Total: $%.2f%n", subtotal);

    }
}
