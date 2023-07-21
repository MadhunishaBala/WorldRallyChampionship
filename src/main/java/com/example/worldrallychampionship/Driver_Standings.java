package com.example.worldrallychampionship;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver_Standings {
    public static List<Driver> vct()
    {
        List<Driver> drivers = new ArrayList<>(); //a list created to store the drivers
        try {
            BufferedReader driverReader = new BufferedReader(new FileReader("Driver_list.txt"));
            //This is used to read the data from the textfile containing driver details
            String line;
            while ((line = driverReader.readLine()) != null) {
                String[] driverData = line.split("~"); //Splitting the data into parts
                int licenseNum = 0;
                if (!driverData[0].isEmpty()) {
                    licenseNum = Integer.parseInt(driverData[0]);
                }
                String driverName = driverData[1];
                int driverAge = Integer.parseInt(driverData[2]);
                String driverTeam = driverData[3];
                String driverCar = driverData[4];
                int currentPoints = 0;
                if (!driverData[5].isEmpty()) {
                    currentPoints = Integer.parseInt(driverData[5]);

                }
                drivers.add(new Driver(licenseNum, driverName, driverAge, driverTeam, driverCar, currentPoints));

            }
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
        //Bubble sort method is used to sort the currentpoints in descending order.
        for (int i = 0; i < drivers.size() - 1; i++) {
            for (int j = i + 1; j < drivers.size(); j++) {
                if (drivers.get(i).getCurrentPoints() < drivers.get(j).getCurrentPoints()) {
                    Driver temp = drivers.get(i);
                    drivers.set(i, drivers.get(j));
                    drivers.set(j, temp);
                }
            }
        }
        return drivers;
    }
}


