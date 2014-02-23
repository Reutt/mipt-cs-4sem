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
public class ComplexNumber {
    private final double a, b;
    
    public ComplexNumber(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
    
    public ComplexNumber add(ComplexNumber other)
    {
        return new ComplexNumber (a + other.a, b + other.b);
    }
    
    public ComplexNumber sub(ComplexNumber other)
    {
        return new ComplexNumber (a - other.a, b - other.b);
    }
    
    @Override
    public String toString()
    {
            return String.valueOf(a) + (b>=0?" + " + b:" - " + -b) + "*i";
    }
    
    public boolean equals(Object o)
    {
        if(o instanceof ComplexNumber)
        {
            ComplexNumber other = (ComplexNumber)o;
            return this.a==other.a && this.b==other.b;
        }
        else return false;
        
    }
    
}
