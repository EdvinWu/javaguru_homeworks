package Gravitrips_pack.Tests;

import Gravitrips_pack.GameField;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Edwin on 2016.03.07..
 */
public class GameFieldTest {



    @Test
    public void testLeftToRightDiagCheckO(){
        String[][] testField = new String[6][7];
        testField[1][0] ="O";
        testField[2][1] ="O";
        testField[3][2] ="O";
        testField[4][3] ="O";
        GameField field = new GameField();
        field.setGameField(testField);
        assertEquals(true,field.leftToRightDiagCheckO());

    }

    @Test
    public void testLeftToRightDiagCheckO2(){
        String[][] testField = new String[6][7];
        testField[4][6] ="O";
        testField[3][5] ="O";
        testField[2][4] ="O";
        testField[1][3] ="O";
        GameField field = new GameField();
        field.setGameField(testField);
        assertEquals(true,field.leftToRightDiagCheckO());

    }



    @Test
    public void testLeftToRightDiagCheckX(){
        String[][] testField = new String[6][7];
        testField[1][2] ="X";
        testField[2][3] ="X";
        testField[3][4] ="X";
        testField[4][5] ="X";
        GameField field = new GameField();
        field.setGameField(testField);
        assertEquals(true,field.leftToRightDiagCheckO());

    }

    @Test
    public void testLeftToRightDiagCheckX2(){
        String[][] testField = new String[6][7];
        testField[4][3] ="X";
        testField[3][2] ="X";
        testField[2][1] ="X";
        testField[1][0] ="X";
        GameField field = new GameField();
        field.setGameField(testField);
        assertEquals(true,field.leftToRightDiagCheckO());

    }
}