public class Thread8 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); //If we don't want a thread to keep JVM alive if its only thread running
        thread.start();
        sleep(3100);
    }
        public static void sleep(long millis){
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
