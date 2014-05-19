/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project_zk;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jan
 */
public class ZKControl {
    
    List<Contact> listOfContacts = new ArrayList<> ();
    DefaultTableModel controlTable;
    
    public ZKControl ()
    {       
    }
    
    public void ZKCRefreshTable ()
    {
        int i=0;
        while(i<listOfContacts.size())
        {
            controlTable.setValueAt(i+1, i, 0);
            i++;
        }            
    }
    
}
