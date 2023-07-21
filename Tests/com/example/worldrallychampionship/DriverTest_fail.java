package com.example.worldrallychampionship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest_fail {

    @Test
    void test2_getLicenseNum()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        int expected_output= driver.getLicenseNum();
        String actual_output= "10A09";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getDriverName()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        String expected_output= driver.getDriverName();
        int actual_output= 234;
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getDriverAge()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        int expected_output= driver.getDriverAge();
        String actual_output= "66";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getDriverTeam()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        String expected_output= driver.getDriverTeam();
        String actual_output= "Al12";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getDriverCar()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        String expected_output= driver.getDriverCar();
        int actual_output= 23;
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getCurrentPoints()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        int expected_output= driver.getCurrentPoints();
        String actual_output= "be";
        assertEquals(expected_output,actual_output);
    }
}