package javaguru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Edwin on 2016.02.16..
 */
public class CompGuess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        Random randomGenerator = new Random();
        System.out.println("List of commands: 'add` - to add 1-3 to comp's number");
        System.out.println("'reduce' - to reduce comp's number by 1-3");
        System.out.println("'right' - when comp guessed the number");
        System.out.println("Think up a number between 0 and 20");
        int compAnswer = randomGenerator.nextInt(20);
        do {
            System.out.println("Is it " + compAnswer);
            answer = reader.readLine();
            switch (answer) {
                case ("add"):
                    compAnswer += randomGenerator.nextInt(3) + 1;
                    //System.out.println(compAnswer);
                    break;
                case ("reduce"):
                    compAnswer -= randomGenerator.nextInt(3) + 1;
                    // System.out.println(compAnswer);
                    break;
                case ("right"):
                    System.out.println("YAY, i guessed it");
                    break;
                default:
                    System.out.println("Such command does not exist");
            }
        } while (!"right".equals(answer));
    }
}
/*
List of commands: 'add` - to add 1-3 to comp's number
'reduce' - to reduce comp's number by 1-3
'right' - when comp guessed the number
Think up a number between 0 and 20
Is it 7
add
Is it 9
reduce
Is it 7
add
Is it 9
reduce
Is it 7
add
Is it 10
reduce
Is it 8
right
YAY, i guessed it

Process finished with exit code 0

 */