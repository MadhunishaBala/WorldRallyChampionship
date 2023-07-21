package com.example.worldrallychampionship;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Race_Standings
{
    public static List<Race> vrl() {
        List<Race> Races = new ArrayList<>();
        try{
            BufferedReader raceReader = new BufferedReader(new FileReader("Race_list.txt"));
         //The race list is read from the text file
            String line;
            while ((line = raceReader.readLine()) != null) {
                String[] data = line.split("~"); //spliting the race data into parts
                String Date = data[0];
                String Location = data[1];
                int ChampionId = Integer.parseInt(data[2]);

                Races.add(new Race(Date, Location, ChampionId)); //Data is added to the Races.

            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
        for (int i = 0; i < Races.size() - 1; i++) {
            //Linearsort method is used to sort the date in ascending order.
            for (int j = i + 1; j < Races.size(); j++) {
                String date1 = Races.get(i).getDate();
                String date2 = Races.get(j).getDate();

                int day1 = Integer.parseInt(date1.split("/")[0]);
                int day2 = Integer.parseInt(date2.split("/")[0]);
                //compares the day part only,cause the month and year are the same.

                if (day1 > day2) {
                    Race temp = Races.get(i);
                    Races.set(i, Races.get(j));
                    Races.set(j, temp);
                }
            }
        }
        return Races;
    }
}
