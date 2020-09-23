package com.exempel.exempeldoguessinggame;

import java.util.Scanner;
public class ExempelDoGuessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int guessNumber = (int)(1+Math.random()*10);
        int inputNumber;

        do{
            System.out.println("Välj ett nr mellan 1 - 10:");
            inputNumber = sc.nextInt();

            if(inputNumber < guessNumber){
                System.out.println("Ditt nummer är för lågt, försök igen!");
            }
            else if(inputNumber > guessNumber){
                System.out.println("Ditt nummer är för högt, försök igen!");
            }
        }while (inputNumber != guessNumber);

        System.out.println(guessNumber + " är rätt. Du har vunnit!");
    }
}
