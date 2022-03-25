package com.First;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Guessthenumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number= (int)(Math.random()*100);
        int input;

        do {
            System.out.println("Guess the Number: ");
            input=sc.nextInt();

            if (input == number){
                System.out.println("Yes You are right");
                break;}

            else if (input>=number){
                System.out.println("Your number is bigger");
            }

            else
                System.out.println("Your Number is smaller");

        }
        while(input>=0);


    }
}
