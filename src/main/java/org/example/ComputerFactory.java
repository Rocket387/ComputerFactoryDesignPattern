package org.example;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        else if("VM".equalsIgnoreCase(type)) return new VM(ram, hdd, cpu);
        return null;
    }
}
