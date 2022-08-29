package com.car;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {  

    /**
     * Rigorous Test :-)
     */
  
    @Test
    public void accelerateSpeed() {
        Car challenger = new Car("black", 2015, 180);
        challenger.accelerateSpeed();

        int expectedSpeed = 5;
        int actualSpeed = challenger.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void accelerateSpeedUptoLimit() {
        int maxSpeed = 180;
        Car challenger = new Car("black", 2015, maxSpeed);
        challenger.setSpeed(177);
        challenger.accelerateSpeed();

        int expectedSpeed = maxSpeed;
        int actualSpeed = challenger.getSpeed();

        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void accelerateSpeedAtLimit() {
        int maxSpeed = 150;
        Car challenger = new Car("black", 2015, maxSpeed);
        challenger.setSpeed(maxSpeed);
        challenger.accelerateSpeed();

        int expectedSpeed = maxSpeed;
        int actualSpeed = challenger.getSpeed();

        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void decelerateSpeed() {
        Car challenger = new Car("black", 2015, 180);
        challenger.setSpeed(66);
        challenger.decelerateSpeed();

        int expectedSpeed = 61;
        int actualSpeed = challenger.getSpeed();

        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void decelerateSpeedDowntoLimit() {
        Car challenger = new Car("black", 2015, 180);
        challenger.setSpeed(4);
        challenger.decelerateSpeed();

        int expectedSpeed = 0;
        int actualSpeed = challenger.getSpeed();

        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void decelerateSpeedAtLimit() {
        Car challenger = new Car("black", 2015, 180);
        challenger.decelerateSpeed();

        int expectedSpeed = 0;
        int actualSpeed = challenger.getSpeed();

        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void convertToElectric() {
        Car challenger = new Car("black", 2015, 180);
        challenger.convertToElectric();

        assertEquals(true, challenger.getIsElectric());
    }

    @Test
    public void alreadIsElectric() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Car challenger = new Car("black", 2015, 180);
        challenger.setIsElectric(true);
        challenger.convertToElectric();

        String expected = "The car is alread electric";
        String actual = outContent.toString().trim();

        assertEquals(expected, actual);

        System.setOut(originalOut);
    }
}