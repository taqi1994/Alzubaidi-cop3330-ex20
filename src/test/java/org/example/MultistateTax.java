/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.util.*;

class MultistateTax {
    public static void main(String[] args) {
        int amount;
        double total;
        double tax;

        //set both at zero:
        total = 0;
        tax = 0;

        Scanner reader = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        amount = reader.nextInt();

        System.out.print("What state do you live in? ");
        String theState = reader.next();

        if (theState.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = reader.next();

            if (county.equals("Dane")) {

                tax = (amount * 5.005) / 100;
                total = tax + amount;

            }

            System.out.println("The tax is  $" + String.format("%.2f.", tax));
            System.out.println("The total is  $" + String.format("%.2f.", total));
        }

    }
}


