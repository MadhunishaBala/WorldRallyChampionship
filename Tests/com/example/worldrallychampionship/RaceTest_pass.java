package com.example.worldrallychampionship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest_pass {

    @Test
    void testgetDate()
    {
        Race race= new Race("30/06/2022","Norway",1009);
        String expected_output= race.getDate();
        String actual_output= "30/06/2022";
        assertEquals(expected_output,actual_output);

    }

    @Test
    void testgetLocation()
    {
        Race race= new Race("30/06/2022","Norway",1009);
        String expected_output= race.getLocation();
        String actual_output= "Norway";
        assertEquals(expected_output,actual_output);
    }

    @Test
    void testgetChampionId()
    {
        Race race= new Race("30/06/2022","Norway",1009);
        int expected_output= race.getChampionId();
        int actual_output= 1009;
        assertEquals(expected_output,actual_output);
    }
}