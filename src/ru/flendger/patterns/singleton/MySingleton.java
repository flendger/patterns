package ru.flendger.patterns.singleton;

public class MySingleton {
    private static volatile MySingleton instance;
    public String value;

    private MySingleton(String value) {
        this.value = value;
    }

    public static MySingleton getInstance(String value) {
        if (instance == null) {
            synchronized (MySingleton.class) {
                instance = new MySingleton(value);
            }
        }
        return instance;
    }
}
