/**
 * ConsoleDemo.java
 * Created on Mar 12, 2014
 */
package ru.mipt.spring2014.class06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDemo
{
	public static void main (String[] args) throws IOException
	{
		final BufferedReader stdIn = new BufferedReader (new InputStreamReader (System.in));
		while(true)
                {
                    String line = stdIn.readLine ();
                    while(line.endsWith("\\"))
                    {
                        line=line.substring(0, line.length()-1);
                        line+="\n";
                        line+=stdIn.readLine();
                    }
                    
                    if("exit".equalsIgnoreCase(line))
                    {
                        break;
                    }
                    System.out.println (">>>> " + line);
                }
	}
}
