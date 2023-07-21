package com.example.worldrallychampionship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest_fail {

    @Test
    void test2_getDate()
    {
        Race race= new Race("30/06/2022","Norway",1009);
        String expected_output= race.getDate();
        int actual_output= 30/06/2022;
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getLocation()
    {
        Race race= new Race("30/06/2022","Norway",1009);
        String expected_output= race.getLocation();
        int actual_output= 3628;
        assertEquals(expected_output,actual_output);
    }

    @Test
    void test2_getChampionId()
    {
        Race race= new Race("30/06/2022","Norway",1009);
        int expected_output= race.getChampionId();
        String actual_output= "1009";
        assertEquals(expected_output,actual_output);
    }
}