package com.johnmelodyme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class DialogExample {
    private static JDialog d;
    private DialogExample() {
        JFrame f= new JFrame();
        d = new JDialog(f , "Dialog Example", true);
        d.setLayout( new FlowLayout() );
        JButton b = new JButton ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                DialogExample.d.setVisible(false);
            }
        });
        d.add( new JLabel ("Click button to continue."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String args[])
    {
        new DialogExample();
        System.out.println("test");
        //file = new File("file:///C:/Users/johnm/YandexDisk/VPN%20%C2%A0_%C2%A0%20Android%20Developers.pdf");
        //if(file.exists()) desktop.open(file);
    }
}
