package com.example.worldrallychampionship;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DriverEdit {
    public static ArrayList<String> driverList = new ArrayList<String>();
    public static ArrayList<String> raceList = new ArrayList<String>();

    public static void RFF() {
        //Loads the data in the file to the console in the start of the program
        try {
            BufferedReader driverReader = new BufferedReader(new FileReader("Driver_list.txt"));
            String line = driverReader.readLine();
            while (line != null) {
                driverList.add(line);
                line = driverReader.readLine();
            }
            driverReader.close();

            BufferedReader raceReader = new BufferedReader(new FileReader("Race_list.txt"));
            line = raceReader.readLine();
            while (line != null) {
                raceList.add(line); //ADD THE DATA FROM THE TEXT FILE TO THE LIST
                line = raceReader.readLine();
            }
            raceReader.close();

            System.out.println("Driver List:"+driverList); //DISPLAYS THE DATA IN THE DRIVER LIST
            System.out.println("Race List:"+raceList); //DISPLAYS THE DATA IS THE RACE LIST

        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }


    public static void add(String driverdetails) {  //saves the data to the driver list text file
        try {
            FileWriter fileWriter = new FileWriter("Driver_list.txt", true); // open file in append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(driverdetails); // append new data to the end of the file
            System.out.println("Driver details is successfully added");
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Driver details were not added");
        }
    }

    public static void DDD(String deleteDriver) {
        boolean driverFound = false;
        try {
            File file = new File("Driver_list.txt");

            List<String> driverList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String Line;
            while ((Line = reader.readLine()) != null) {
                driverList.add(Line);
            }
            reader.close(); //READS THE DRIVER TEXT FILE AND ADDS TO THE ARRAY LIST

            for (int i = 0; i < driverList.size(); i++) { // LOOPS THROUGH EACH DATA IN THE LIST
                String[] driverData = driverList.get(i).split("~");
                if (driverData[0].equals(deleteDriver)) { //CHECKS IF THE ENTERED DATA IS EQUAL TO THE VALUE IN THE LIST
                    driverList.remove(i);
                    driverFound = true;
                    break;
                }
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            //WRITES THE REST OF THE DETAILS TO THE TEXTFILE
            for (String driver : driverList) {
                writer.write(driver);
                writer.newLine();
            }
            writer.close();

            if (driverFound) {
                System.out.println("Driver is removed");
            } else {
                System.out.println("Driver not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

