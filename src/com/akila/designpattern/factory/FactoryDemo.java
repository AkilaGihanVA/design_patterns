package com.akila.designpattern.factory;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project design_patterns
 */
public class FactoryDemo {
    public static void main(String[] args) {
        FolioService folioService = FolioServiceFactory.getFolioService(FolioType.GENERAL);

        System.out.println(folioService.getClass().getName());
    }
}
