package com.johnmelodyme;

import java.util.Formatter;

public class exportFile {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\johnm\\Downloads\\test.txt");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
