package firstLambda;

public class RunnableLambda {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Olá mundo");

        Thread t = new Thread(runnable);
        t.start();

    }
}
