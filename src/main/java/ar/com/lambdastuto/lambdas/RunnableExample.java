package ar.com.lambdastuto.lambdas;

public class RunnableExample {
    public static void main(String[] args) {
        //runnable traditional example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println("traditional:"+ sum);
                }
            }
        };
        new Thread(runnable).start();

        // implement using lambda
        Runnable runnable1 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("Runnable lambda: "+ sum);
            }
        };
        new Thread(runnable1).start();

        // implement using thread with lambda
        new Thread( () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("Thread lambda: " + sum);
            }
        }).start();
    }
}
