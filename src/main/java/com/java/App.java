package com.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String whereCluse = """
				semester = %d
				and name = %s
				""".formatted(441 , "'ahmed'");
System.out.println(whereCluse );
    }
}
