/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project_zk;

/**
 *
 * @author Jan
 */
public class Contact {
    private final String name1, name2, name3, telnum, icqnum, skypenum;
    
    public Contact(String name1, String name2, String name3, String telnum, String icqnum, String skypenum)
    {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.telnum = telnum;
        this.icqnum = icqnum;
        this.skypenum = skypenum;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getIcqnum() {
        return icqnum;
    }

    public String getSkypenum() {
        return skypenum;
    }

    public String getTelnum() {
        return telnum;
    }

    @Override
    public String toString() {
        return this.name1+"|"+this.name2+"|"+this.name3+"|"
                +this.telnum+"|"+this.icqnum+"|"+this.skypenum; //To change body of generated methods, choose Tools | Templates.
    }
    
}
