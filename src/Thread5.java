public class Thread5 {
    public static void main(String[] args) {
        Runnable runnable=()->{
           String threadName= Thread.currentThread().getName();
            System.out.println(threadName+ " is running");
        };

        Thread thread=new Thread(runnable, "The thread 1");
        thread.start();
        Thread thread2=new Thread(runnable, "The thread 2");
        thread2.start();
    }
}
