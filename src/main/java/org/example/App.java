package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Computer pc = ComputerFactory.getComputer("pc", " 2GB", "500GB", "2.4GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        Computer vm = ComputerFactory.getComputer("vm","16 GB","1 TB","3 GHz");

        System.out.println( "Factory PC Config: " + pc);
        System.out.println( "Factory Server Config: " + server);
        System.out.println( "Factory VM Config: " + vm);
    }
}
