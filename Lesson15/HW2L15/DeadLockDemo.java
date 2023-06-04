class DeadlockDemo extends Thread {
    public static void main(String s[]) {
        Object first = new Object();
        Object second = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (first) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                    synchronized (second) {
                        System.out.println("Success!");}
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (second) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                    synchronized (first) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}