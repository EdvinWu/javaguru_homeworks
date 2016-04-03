package javaguru.gravitrips.tests;


import javaguru.gravitrips.Chip;
import javaguru.gravitrips.GameField;
import org.junit.Test;

import java.util.Arrays;

import static javaguru.gravitrips.Chip.*;
import static org.junit.Assert.*;


public class GameFieldTest {
    GameField fieldForTest = new GameField();
    private final int COLUMNS = 7;
    private final int ROWS = 6;


    @Test
    public void testCheckDraw() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                testField[i][j] = O;
            }
        }
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.checkDraw());
    }

    @Test
    public void testVerticalCheckO() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[1][0] = O;
        testField[2][0] = O;
        testField[3][0] = O;
        testField[0][0] = O;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.fieldCheck(O));
    }


    @Test
    public void testVerticalCheckO2() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[1][2] = O;
        testField[2][2] = O;
        testField[3][2] = O;
        testField[0][0] = O;
        fieldForTest.setGameField(testField);
        assertEquals(false, fieldForTest.fieldCheck(O));
    }


    @Test
    public void testVerticalCheckX() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[1][4] = X;
        testField[2][4] = X;
        testField[3][4] = X;
        testField[0][4] = X;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.fieldCheck(X));
    }

    @Test
    public void testVerticalCheckX2() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[5][3] = X;
        testField[4][4] = X;
        testField[5][5] = X;
        testField[5][6] = X;
        fieldForTest.setGameField(testField);
        assertEquals(false, fieldForTest.fieldCheck(X));
    }

    @Test
    public void testHorizontalCheckX() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[2][6] = X;
        testField[3][6] = X;
        testField[4][6] = X;
        testField[5][5] = X;
        fieldForTest.setGameField(testField);
        assertEquals(false, fieldForTest.fieldCheck(X));
    }

    @Test
    public void testHorizontalCheckX2() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[1][4] = X;
        testField[1][2] = X;
        testField[1][3] = X;
        testField[1][1] = X;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.fieldCheck(X));
    }

    @Test
    public void testHorizontalCheckO() {
        Chip[][] testField = new Chip[ROWS][COLUMNS];
        testField[1][4] = O;
        testField[1][2] = O;
        testField[1][3] = O;
        testField[1][1] = O;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.fieldCheck(O));
    }

    @Test
    public void testGetColumn() {
        Chip[][] testField = new Chip[6][7];
        testField[1][2] = O;
        testField[2][2] = O;
        testField[4][2] = X;
        testField[5][2] = X;
        fieldForTest.setGameField(testField);
        System.out.println(Arrays.toString(fieldForTest.getColumn(2)));
    }
}



