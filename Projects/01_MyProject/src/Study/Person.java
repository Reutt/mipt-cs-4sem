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
public class Person {
    private String firstName, lastName;
    private final int[] birthDay = {0, 0, 0};

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getBirthDay() {
        return birthDay;
    }
    
    public void setBirthDay(int Day, int Month, int Year) {
        this.birthDay[0] = Day;
        this.birthDay[1] = Month;
        this.birthDay[2] = Year;
    }

    @Override
    public String toString() {
        return (firstName!=null?firstName:"")+" "+(lastName!=null?lastName:""); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
