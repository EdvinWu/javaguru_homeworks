package javaguru.procedural;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Edwin on 2016.02.15..
 */
public class HumanGuess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int humGuessNum = 0;
        Random randomGenerator = new Random();
        int guessNum = randomGenerator.nextInt(100)+1;
        //  System.out.println(guessNum);
        System.out.println("Try to guess. Number are in 1 - 100 interval");
        // int diff = 0;
        do {
            humGuessNum = Integer.parseInt(reader.readLine());
            if (humGuessNum < 0 || humGuessNum > 100) {
                System.out.println("wrong entry, please try again");
            } else {
                int diff = guessNum - humGuessNum;
                if (0 < diff && diff < 5) {
                    System.out.println("your number is less on  1 - 4");
                } else if (5 <= diff && diff < 10) {
                    System.out.println("your number is less on  5 - 9");
                } else if (10 <= diff && diff < 30) {
                    System.out.println("your number is less on  10 - 29");
                } else if (30 <= diff) {
                    System.out.println("difference is too much, guess another number");
                } else if (-5 < diff && diff < 0) {
                    System.out.println("your number is bigger on  1 - 4 ");
                } else if (-10 < diff && diff <= -5) {
                    System.out.println("your number is bigger on  5 - 9");
                } else if (-30 < diff && diff <= -10) {
                    System.out.println("your number is bigger on 10 - 29");
                } else if (diff <= -30) {
                    System.out.println("difference is too much, guess another number");
                }
            }
        } while (humGuessNum != guessNum);
        System.out.println("Congrats , you guessed it");
    }
}
/*
Try to guess. Number are in 0 - 100 interval
20
difference is too much, guess another number
80
your number is bigger on  5 - 9
75
your number is bigger on  1 - 4
73
your number is bigger on  1 - 4
72
your number is bigger on  1 - 4
71
Congrats , you guessed it

Process finished with exit code 0

 */
