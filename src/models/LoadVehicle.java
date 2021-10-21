/*
 * File: LoadVehicle.java
 * Created Date: 2021-09-24 22:21:42
 * Authors:Fésű Gábor,Vásárhelyi Ágoston, Baráth Máté 
 * Original Author: Sallai Andras
 * Github: https://github.com/gostonnn

 *         
 * -----
 * Last Modified: 2021-10-208
 * Modified By: Fésű Gábor,Vásárhelyi Ágoston, Baráth Máté 
 * -----
 * Copyright (c) 2021 Fésű Gábor,Vásárhelyi Ágoston, Baráth Máté 
 * Group: Szoft II/N
 * 
 * GNU GPL v2
 */

package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadVehicle {
    ArrayList<String> vehicles;
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    public LoadVehicle() {
        vehicles = new ArrayList<>();
    }

    public void load(){
        tryLoad();    
    }
    public ArrayList<Vehicle> tryLoad(){ 
    try {
        FileReader fileReader = new FileReader("data.txt");
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            Vehicle vehicle = new Vehicle();
            vehicle.ordinal = lineArray[0];
            vehicle.brand = lineArray[1];
            vehicle.year = lineArray[2];
            vehicleList.add(vehicle);
        }
        scanner.close();

    } catch (FileNotFoundException e) {
        System.err.println("Hiba! A fájl nem található");
    }
    return vehicleList;
    }
}
