/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int euros;
        float exchangeRate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        euros = scanner.nextInt();

        System.out.println("What is the exchange rate?");
        exchangeRate = scanner.nextFloat();

        scanner.close();

        System.out.printf("%d euros at an exchange rate of %.4f is %.2f US dollars.", euros, exchangeRate, euros * exchangeRate);
    }
}
