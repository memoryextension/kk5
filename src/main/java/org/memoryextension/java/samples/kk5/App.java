package org.memoryextension.java.samples.kk5;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void doRythmicLyrics(int n) {
		for(int beat = 1;beat<n;beat++) {
        	System.out.print(Integer.toString(beat));
        	if(beat%3==0) { System.out.println(": King" );}
        	else if(beat%4==0) { System.out.println(": Kong" );}
        	else if(beat%3==0 && beat%4 ==0 ) { System.out.println(": King Kong FIVE" );}
        	else { System.out.println(": -" ); }
        	
        }
	}
	
    public static void main( String[] args )
    {
    	doRythmicLyrics(24);	
        
    }
}
