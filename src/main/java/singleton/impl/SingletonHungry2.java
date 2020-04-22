package singleton.impl;

public class SingletonHungry2 {
    private static SingletonHungry2 instance = null;

    static {
        instance = new SingletonHungry2();
    }

    private SingletonHungry2() {
    }

    public static SingletonHungry2 getInstance() {
        return instance;
    }
} 