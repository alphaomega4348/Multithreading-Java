/// Method 3: Create anonymous implementation of runnable interface which is similar to method 2
public class Thread3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is Running");
                System.out.println("Thread finished");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
