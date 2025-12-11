/// Method 4: Create a Java lambda expression that implements the runnable interface.

public class Thread4 {
    public static void main(String[] args) {
            Runnable runnable=()->{
                System.out.println("Thread is Running");
                System.out.println("Thread finished");
            };

            Thread thread=new Thread(runnable);
            thread.start();
    }
}
