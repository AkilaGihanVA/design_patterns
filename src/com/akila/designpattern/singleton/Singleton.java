package com.akila.designpattern.singleton;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project design_patterns
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton != null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}
