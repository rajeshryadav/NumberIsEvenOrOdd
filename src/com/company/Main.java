package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number;

        Scanner obj = new Scanner(System.in);
        number = obj.nextInt();
        if (number%2 == 0)

        {
            System.out.println("it is even number");

        } else
        {
            System.out.println("it is odd number");
        }

    }
}
