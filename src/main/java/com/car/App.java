package com.car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Honda civic = new Honda("red", 2015, 120, false);
        Lexus rx350 = new Lexus("black", 2018, 150, true);
        Toyata supra = new Toyata("grey", 2005, 100, true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());        
    }
}
