/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Sachin Mishra
 */

package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int galConv = 350; //one gallon covers 350 square feet

        System.out.print("What is the length of the ceiling in feet? (Please enter whole numbers). ");
        int length = input.nextInt();

        System.out.print("What is the width of the ceiling in feet? (Please enter whole numbers). ");
        int width = input.nextInt();

        int area = length * width;

        int gallons = area / galConv;
        if(area % galConv != 0){
            gallons++;
        }

        System.out.println();
        System.out.printf("You need %d gallons of paint", gallons);
    }
}
