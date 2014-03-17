/**
 * IndexString.java
 * Created on Mar 4, 2014
 */
package ru.mipt.spring2014.class05;


import java.util.Objects;


public class IndexString implements Comparable<IndexString>
{

	private final int index;
	private final String value;

	public IndexString (int index, String value)
	{
		this.index = index;
		this.value = value;
	}

	@Override
	public String toString ()
	{
		return "#" + index + " " + value;
	}

	@Override
	public int hashCode ()
	{	
		return index*29+Objects.hashCode (value)*11+13; //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean equals (Object obj)
	{
		if (obj instanceof IndexString)
		{
			IndexString other = (IndexString)obj;
			return (this.index==other.index)&&(Objects.equals (this.value, other.value));
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public int compareTo (IndexString other)
	{
		if(this.index<other.index)
		{
			return -1;
		}
		
		if(this.index>other.index)
		{
			return 1;
		}
		
		return this.value.compareTo (other.value);
	}
}
