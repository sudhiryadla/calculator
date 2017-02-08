package com.org.proj.module.calculator;

/**
 * Main class to invoke calculate method.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args.length == 0){
    		System.out.println("Please provide the arithmetic expression to calculate");
    		System.exit(0);
    	}
    	System.out.printf("Calculated Value: %.2f \n",(new Calculator().calculate(args[0])));
    }
}
