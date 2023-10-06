package Assignment_1;

public class Test {
    public static void main(String[] args){
        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            singleton.demonstrateFunctionality();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
