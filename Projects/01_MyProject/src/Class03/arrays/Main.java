/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class03.arrays;

import Study.Person;
import Study.Student;

/**
 *
 * @author Jan
 */
public class Main {
    public static void main (String[] args)
    {
        /*Vector v1 = new Vector(1.3,2.7,4),
               v2 = new Vector(1.7,2.3,5);
        
        System.out.println("Vector demo");
        System.out.println(v1+" + "+v2+" = "+v1.add(v2));
        System.out.println(v1+" - "+v2+" = "+v1.sub(v2));*/
        Person vanya = new Person("Ivan","Ivanov");
        Student vasya = new Student("Vasya","Vasyechkin");
        System.out.println(vanya);
        System.out.println(vasya);
        vasya.setGroup("404");
        System.out.println(vasya);
    }
    
}
