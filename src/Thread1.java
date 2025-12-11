/// Method 1: Extend thread class and override the run method

public class Thread1 extends Thread {

        @Override
        public void run() {
            System.out.println("Thread is Running");
            System.out.println("Thread finished");
        }


    public static void main(String[] args) {
        Thread1 myThread=new Thread1();
        myThread.start();
    }
}
