package javaguru_homeworks.Gravitrips_pack.Tests;


import javaguru_homeworks.Gravitrips_pack.Chips;
import javaguru_homeworks.Gravitrips_pack.GameField;
import org.junit.Test;

import static javaguru_homeworks.Gravitrips_pack.Chips.*;
import static org.junit.Assert.*;


/**
 * Created by Edwin on 2016.03.07..
 */
public class GameFieldTest {
    GameField fieldForTest = new GameField();


    @Test
    public void testCheckDraw() {
        Chips[][] testField = new Chips[6][7];
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
        Chips[][] testField = new Chips[6][7];
        testField[1][0] = O;
        testField[2][0] = O;
        testField[3][0] = O;
        testField[0][0] = O;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.verticalCheckO());
    }


    @Test
    public void testVerticalCheckO2() {
        Chips[][] testField = new Chips[6][7];
        testField[1][2] = O;
        testField[2][2] = O;
        testField[3][2] = O;
        testField[0][0] = O;
        fieldForTest.setGameField(testField);
        assertEquals(false, fieldForTest.verticalCheckO());
    }


    @Test
    public void testVerticalCheckX() {
        Chips[][] testField = new Chips[6][7];
        testField[1][4] = X;
        testField[2][4] = X;
        testField[3][4] = X;
        testField[0][4] = X;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.verticalCheckX());
    }

    @Test
    public void testVerticalCheckX2() {
        Chips[][] testField = new Chips[6][7];
        testField[1][4] = X;
        testField[2][2] = X;
        testField[3][2] = X;
        testField[0][2] = X;
        fieldForTest.setGameField(testField);
        assertEquals(false, fieldForTest.verticalCheckX());
    }

    @Test
    public void testHorizontalCheckX() {
        Chips[][] testField = new Chips[6][7];
        testField[1][4] = X;
        testField[2][2] = X;
        testField[3][2] = X;
        testField[0][2] = X;
        fieldForTest.setGameField(testField);
        assertEquals(false, fieldForTest.horizontalCheckX());
    }

    @Test
    public void testHorizontalCheckX2() {
        Chips[][] testField = new Chips[6][7];
        testField[1][4] = X;
        testField[1][2] = X;
        testField[1][3] = X;
        testField[1][1] = X;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.horizontalCheckX());
    }
    @Test
    public void testHorizontalCheckO() {
        Chips[][] testField = new Chips[6][7];
        testField[1][4] = O;
        testField[1][2] = O;
        testField[1][3] = O;
        testField[1][1] = O;
        fieldForTest.setGameField(testField);
        assertEquals(true, fieldForTest.horizontalCheckO());
    }
}


