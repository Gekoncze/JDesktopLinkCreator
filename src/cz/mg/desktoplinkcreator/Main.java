package cz.mg.desktoplinkcreator;

import cz.mg.desktoplinkcreator.gui.MainWindow;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
            System.out.println("WARNING: Could not set system look and feel.");
        }
        MainWindow mainWindow = new MainWindow();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}