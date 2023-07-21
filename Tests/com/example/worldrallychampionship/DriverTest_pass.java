package com.example.worldrallychampionship;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverTest_pass {

    @Test
    void testgetLicenseNum()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        int expected_output= driver.getLicenseNum();
        int actual_output= 1009;
        assertEquals(expected_output,actual_output);

    }

    @Test
    void testgetDriverName()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        String expected_output= driver.getDriverName();
        String actual_output= "Virat";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void testgetDriverAge()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        int expected_output= driver.getDriverAge();
        int actual_output= 66;
        assertEquals(expected_output,actual_output);
    }

    @Test
    void testgetDriverTeam()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        String expected_output= driver.getDriverTeam();
        String actual_output= "Alpha";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void testgetDriverCar()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        String expected_output= driver.getDriverCar();
        String actual_output= "Benz";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void testgetCurrentPoints()
    {
        Driver driver= new Driver(1009,"Virat",66,"Alpha","Benz",46);
        int expected_output= driver.getCurrentPoints();
        int actual_output= 46;
        assertEquals(expected_output,actual_output);
    }
}