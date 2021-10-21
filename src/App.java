/*
 * File: App.java
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

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    } 
}
