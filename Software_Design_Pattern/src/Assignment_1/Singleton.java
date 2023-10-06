package Assignment_1;

/*
    public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров извне.
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void demonstrateFunctionality() {
        System.out.println("Singleton instance is working.");
    }
}
*/
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров извне.
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void demonstrateFunctionality() {
        System.out.println("Singleton instance is working.");
    }
}
