package com.akila.designpattern.builder;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project design_patterns
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Computer.Builder computerBuilder = new Computer.Builder();

        computerBuilder.setCasing("Black").setHardDisk("1 TB").setProcessor("i7").setRam("12GB");

        Computer computer = computerBuilder.build();

        System.out.println(computer);
    }
}
