class Hw1 {

    static public class MyRunnable implements Runnable {
        String mes;
        int interval;
        public MyRunnable(String mes, int interval) {
            this.mes = mes;
            this.interval = interval;
        }
        @Override
        public void run() {

            for (int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                }
                System.out.println(mes);
            }

        }
    }
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new MyRunnable("Hello", 3000));
        var t2 = new Thread(new MyRunnable("Bye", 2000));
        var t3 = new Thread(new MyRunnable("Aloha", 1500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}