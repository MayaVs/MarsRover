package com.techreturn.test;

import com.sun.source.tree.AssertTree;
import com.techreturn.mars.Plateau;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PlateauTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void plateauExceptionTest() throws Exception {
        //Assign
        exceptionRule.expect(Exception.class);

        //Act
        Plateau plateau = new Plateau(3, -3);

        //Assert
        exceptionRule.expectMessage("Invalid coordinates.");
    }

    @Test
    public void isPositionFreeTest() throws Exception {
        //Assign
        Plateau plateau = new Plateau(3, 3);

        //Act
        //By default all positions are free!
        boolean res = plateau.isPositionFree(0, 0);

        //Assert
        assertTrue(res);
    }

    @Test
    public void isPositionFreeExceptionTest() throws Exception {
        //Assign
        Plateau plateau = new Plateau(3, 3);
        exceptionRule.expect(Exception.class);

        //Act
        boolean res = plateau.isPositionFree(4, 0);

        //Assert
        exceptionRule.expectMessage("Invalid position.");
    }

    @Test
    public void setPositionOccupiedTest() throws Exception {
        //Assign
        Plateau plateau = new Plateau(3, 3);

        //Act
        plateau.setPositionOccupied(1, 1);
        boolean res = plateau.isPositionFree(1, 1);

        //Assert
        assertFalse(res);
    }

    @Test
    public void setPositionFreeTest() throws Exception {
        //Assign
        Plateau plateau = new Plateau(3, 3);
        plateau.setPositionOccupied(1, 1); //this one is already tested

        //Act
        plateau.setPositionFree(1, 1);
        boolean res = plateau.isPositionFree(1, 1);

        //Assert
        assertTrue(res);
    }


}
