/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyPackage;

/**
 *
 * @author Jan
 */
public class Demo {
    public static void main (String[] args)
    {
        System.out.println("ComplexNumber class demo");
        
        ComplexNumber c1 = new ComplexNumber(5,3), 
                c2 = new ComplexNumber(2, -1),
                c3 = new ComplexNumber(5,3);
        
        System.out.println("(" + c1 + ") + (" + c2 + ") = " + c1.add(c2));
        System.out.println("(" + c1 + ") - (" + c2 + ") = " + c1.sub(c2));
        
        /*System.out.println(c1 + (c1==c2?" = ":" != ") + c2);
        System.out.println(c1 + (c1==c3?" = ":" != ") + c3);
        System.out.println(c2 + (c2==c3?" = ":" != ") + c3);*/
        
        System.out.println(c1 + (c1.equals(c2)?" = ":" != ") + c2);
        System.out.println(c1 + (c1.equals(c3)?" = ":" != ") + c3);
        System.out.println(c2 + (c2.equals(c3)?" = ":" != ") + c3);
    }
    
}
