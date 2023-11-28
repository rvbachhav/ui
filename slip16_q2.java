package java_Slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class slip16_q2 {
    public static void main(String[] args) {
        Frame frame = new Frame("JAVA AWT Example");
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        newItem.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        Menu editMenu = new Menu("Edit");

        Menu aboutMenu = new Menu("About");
        MenuItem aboutItem = new MenuItem("About");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "This is a simple AWT screen"));

        aboutMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);

        frame.setMenuBar(menuBar);

        frame.setVisible(true);
    }
}