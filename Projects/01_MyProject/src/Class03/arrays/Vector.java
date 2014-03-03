/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class03.arrays;

/**
 *
 * @author Jan
 */
public class Vector {
    private final double[]components;
    
    public Vector (int dimension)
    {
        this.components = new double[dimension];
    }
    
    public Vector (double... components)
    {
        this.components = components;
    }
    
    public Vector add (Vector other)
    {
        if (components.length == other.components.length)
        {
            final double[] newCoords = new double[components.length];
            for (int i=0; i < components.length; i++)
            {
                newCoords[i] = components[i] + other.components[i];
            }
        return new Vector(newCoords);
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    
    public Vector sub (Vector other)
    {
        if (components.length == other.components.length)
        {
            final double[] newCoords = new double[components.length];
            for (int i=0; i < components.length; i++)
            {
                newCoords[i] = components[i] - other.components[i];
            }
        return new Vector(newCoords);
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sv= new StringBuilder("("+components[0]);
        for (int i=1; i < components.length; i++)
        {
            sv.append(","+components[i]);
        }
        sv.append(")");
        return sv.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
