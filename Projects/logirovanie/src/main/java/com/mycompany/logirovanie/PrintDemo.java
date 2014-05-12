package com.mycompany.logirovanie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jan
 */
public class PrintDemo {
    public static void main (String[] args)
    throws FileNotFoundException
    {
        try (PrintStream log = new PrintStream(new FileOutputStream ("print_demo.log", true)))
        {
            log.println(new Date(System.currentTimeMillis()).toString());
            log.println ("Some message");
            log.println ("Some other message");
            log.println(" ");
        }
    }
    
}
