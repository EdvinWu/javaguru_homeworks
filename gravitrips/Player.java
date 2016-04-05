package javaguru.gravitrips;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Player {
    void makeTurn(GameField pole);

    default int enterAndCheck() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int j;
        do {
            System.out.println("Enter a column Number: 1-7");
            try {
                j = Integer.parseInt(reader.readLine()) - 1;
            } catch (IOException | java.lang.NumberFormatException e) {
                System.out.println("Something went wrong, check your entry");
                j = enterAndCheck();
            }
        } while (j < 0 || j > 6);
        return j;
    }
}
