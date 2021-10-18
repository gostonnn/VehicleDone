/*
 * File: MainController.java
 * Created Date: 2021-09-24 22:22:42
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

package views;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends JFrame {
    
    public JLabel vehicleLabel;
    public JPanel controlPanel;
    public JPanel formPanel;
    public JPanel buttonPanel;
    public JLabel ordinalLabel;
    public JTextField ordinalField;
    public JLabel brandLabel;
    public JTextField brandField;
    public JLabel yearLabel;
    public JTextField yearField;
    public JButton addButton; 
    public JButton delButton;
    public JButton saveButton;

    public DefaultTableModel vehicleModel;
    public JTable vehicleTable;
    public JScrollPane vehicleScrollPane;

    public MainWindow() {

        InitControlPanel();
        InitFormPanel();
        InitButton();
        InitControlPanelSetLayOut();
        InitVehicleModel();
        InitVehicleLabel();
        InitRest();
    }

    public void InitControlPanel(){

        this.controlPanel = new JPanel();
        this.ordinalLabel = new JLabel("Rendszám");
        this.ordinalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.ordinalLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        this.ordinalField = new JTextField();
        this.brandLabel = new JLabel("Márka");
        this.brandLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.brandLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        this.brandField = new JTextField();
        this.yearLabel = new JLabel("Év");
        this.yearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.yearLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
        this.yearField = new JTextField(); 
    }

    public void InitFormPanel(){

        this.formPanel = new JPanel();
        this.formPanel.setLayout(new GridLayout(3, 2));
        this.formPanel.add(this.ordinalLabel);
        this.formPanel.add(this.ordinalField);
        this.formPanel.add(this.brandLabel);
        this.formPanel.add(this.brandField);
        this.formPanel.add(this.yearLabel);
        this.formPanel.add(this.yearField);
    }

    public void InitButton() {

        this.addButton = new JButton("Hozzáadás");
        this.delButton = new JButton("Törlés");
        this.saveButton = new JButton("Mentés");
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, BoxLayout.PAGE_AXIS));
        this.buttonPanel.add(this.addButton);
        this.buttonPanel.add(this.delButton);
        this.buttonPanel.add(this.saveButton);
    }

    public void InitControlPanelSetLayOut() {

        this.controlPanel.setLayout(new BoxLayout(this.controlPanel, BoxLayout.LINE_AXIS));
        this.controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.controlPanel.add(this.formPanel);
        this.controlPanel.add(this.buttonPanel);
    }

    public void InitVehicleModel(){

        this.vehicleModel = new DefaultTableModel();
        this.vehicleTable = new JTable(vehicleModel);
        this.vehicleScrollPane = new JScrollPane(this.vehicleTable);
        this.vehicleScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Object[] tableLabels = {"Rendszám", "Márka", "Év"};
        this.vehicleModel.setColumnIdentifiers(tableLabels);
    }

    public void InitVehicleLabel() {

        this.vehicleLabel = new JLabel("Járművek");
        this.vehicleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.vehicleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    public void InitRest() {

        this.add(this.vehicleLabel);
        this.add(this.controlPanel);
        this.add(this.vehicleScrollPane);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    
}
