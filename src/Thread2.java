/// Method 2: Implement runnable interface and then pass the instance of the runnable to constructor of thread

public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is Running");
        System.out.println("Thread finished");
    }

    public static void main(String[] args) {
        Thread thread =new Thread(new Thread2());
        thread.start();
    }
}


