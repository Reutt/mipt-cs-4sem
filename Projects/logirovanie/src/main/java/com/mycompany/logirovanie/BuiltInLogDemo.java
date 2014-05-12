/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.logirovanie;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Jan
 */
public class BuiltInLogDemo {
    public static void main (String [] args)
    throws IOException
    {
        Logger log = Logger.getLogger(BuiltInLogDemo.class.getName());
        log.setLevel(Level.FINEST);
        
        FileHandler handler = new FileHandler("built_in_log_demo.log", 256, 3, true);
        handler.setFormatter (new SimpleFormatter());
        log.addHandler(handler);
        
        log.info ("Sample message");
        log.info ("Another message");
        log.finest ("Very verbose message");
        log.info ("One more message");
        log.info ("And one more message");
    }
    
}
