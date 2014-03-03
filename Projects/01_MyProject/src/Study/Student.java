/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Study;

/**
 *
 * @author Jan
 */
public class Student extends Person {
    private String group;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString()+(group!=null?", group "+group:""); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
