package com.johnmelodyme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

public class testGUI {
    public static void main(String[] args){
        // Instance of FRAME:
        JFrame f = new JFrame("Testing GUI -- John Melody");
        // Menubar:
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);
        // JFrame Icon:
        //setIconImage(new ImageIcon("C:\\Users\\johnm\\Documents\\InteliJ\\tutorial\\img\\icon.png").getImage());
        // Instance Of BUTTONS:
        JButton b = new JButton("Button");
        b.setBounds(130,100,100, 40);
        //add button to the frame:
        f.add(b);
        // TextField declaration:
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 260,20);
        // Onclick listener button declaration with [lambda]:
        b.addActionListener(e -> tf.setText("THE BUTTON HAS BEEN CLICKED"));

        // adds menu bar to the frame
        f.setJMenuBar(menuBar);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // visibility of the declaration :
        f.add(b);f.add(tf);
        // Frame size:
        f.setSize(400,200);
        //using no layout managers :
        f.setLayout(null);
        //making the frame visible
        f.setVisible(true);
    }
}
