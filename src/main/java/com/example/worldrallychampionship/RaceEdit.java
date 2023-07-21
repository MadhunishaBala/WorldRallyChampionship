package com.example.worldrallychampionship;
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class RaceEdit {

    public static String SRR() {
        boolean Flag = false;
        String race_date = ((new Random().nextInt(30) + 1) + "/06/2022");
        String[] Race_locations = {"Nyirad", "Holjes", "Montalegre", "Barcelona", "Riga", "Norway"};
        int index = new Random().nextInt(6);
        String location = Race_locations[index];
        String data = race_date + "~" + location;

        List<String> random_driver = new ArrayList<>();
        //list is created to store a random driver from the drivers in the text file

        try {
            BufferedReader raceReader = new BufferedReader(new FileReader("Driver_list.txt"));
            String line;
            while ((line = raceReader.readLine()) != null) {
                String[] driver_data = line.split("~");
                random_driver.add(driver_data[0]);
                //takes the driver license from the text file and adds to the array list
            }
        } catch (IOException e) {
            System.out.println("Error occured");
        }

        //selects a random driver from the list
        for (int index1 = 1; index1 <= random_driver.size(); index1++) {
            Flag = true;
            String name = null;
            while (Flag == true) {
                int value = new Random().nextInt(random_driver.size());
                name = random_driver.get(value);
                Flag = false;
                int count = 0;
                while (Flag == false && count < index1 - 1) { //checks if the driver has been selected already
                    if (random_driver.get(count).equals(name)) {
                        Flag = true;
                    }
                    count = count + 1;
                }
            }
            random_driver.remove(name);

            int points = 0;  //points are randomly assigned to the drivers
            if (index1 == 1) {
                points = 10;
            } else if (index1 == 2) {
                points = 7;
            } else if (index1 == 3) {
                points = 5;
            } else {
                points = 0;
            }

            try {
                BufferedReader raceReader = new BufferedReader(new FileReader("Driver_list.txt"));
                String line;
                List<String> driverList = new ArrayList<>();
                while ((line = raceReader.readLine()) != null) {
                    driverList.add(line);
                    if (line.startsWith(name)) {
                        String[] driver_data = line.split("~");
                        int value = 0;
                        try {
                            value = Integer.parseInt(driver_data[5]) + points; //adds the new points to the driver
                        } catch (NumberFormatException e) {
                            // handle the exception by setting value to zero
                            value = 0;
                        }
                        driver_data[5] = Integer.toString(value);


                        driverList.set(driverList.size() - 1, String.join("~", driver_data));
                    }
                }
                //Writes the updated data to the driver list file
                FileWriter writer = new FileWriter("Driver_list.txt");
                for (String driver : driverList) {
                    writer.write(driver + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            data = data + "~" + name + "~" + points;
        }

        try {
            FileWriter fileWriter = new FileWriter("Race_list.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(data); //New data will be appeneded to the file
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return (race_date + " " + location);
    }
}
