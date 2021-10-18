/*
 * File: MainController.java
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

package controllers;

import java.util.ArrayList;
import models.LoadVehicle;
import models.Vehicle;
import views.MainWindow;

public class MainController {

    MainWindow mainWindow;
    LoadVehicle loadVehicle;
    public MainController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.loadVehicle = new LoadVehicle();

        ArrayList<Vehicle> vehicleList = this.loadVehicle.tryLoad();
        for(Vehicle vehicle : vehicleList) {
            this.mainWindow.vehicleModel.addRow(
                new Object[] {vehicle.ordinal, vehicle.brand, vehicle.year}
            );
        }        
        this.mainWindow.addButton.addActionListener(event -> {
            System.out.println("Hozzáadás...");
            addVehicle();
            setEmpty();
            
        });
        this.mainWindow.delButton.addActionListener(event -> {
            System.out.println("Törlés...");
        });

        this.mainWindow.saveButton.addActionListener(event -> {
            System.out.println("Mentés...");
        });  
    }  
    public void setEmpty(){
        this.mainWindow.ordinalField.setText("");
        this.mainWindow.brandField.setText("");
        this.mainWindow.yearField.setText("");
    }  
    public void addVehicle(){
        String ordinal = this.mainWindow.ordinalField.getText();
        String brand = this.mainWindow.brandField.getText();
        String year = this.mainWindow.yearField.getText();
        this.mainWindow.vehicleModel.addRow(
            new Object[] {ordinal, brand, year} 
        ); 
    }
}
