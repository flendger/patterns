package ru.flendger.patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            MySingleton m = MySingleton.getInstance("AAA");
            System.out.println("1" + m.value);
        };
        Runnable r2 = () -> {
            MySingleton m = MySingleton.getInstance("BBB");
            System.out.println(m.value);
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
