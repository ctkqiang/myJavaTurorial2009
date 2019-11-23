package com.johnmelodyme;

import java.util.Formatter;

public class writeFile {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\johnm\\Downloads\\test.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown \r\n");
            f.format("Something Something \r\n");
            f.format("\n");
            f.format("THIS TEXT WRITE FROM JAVA");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
