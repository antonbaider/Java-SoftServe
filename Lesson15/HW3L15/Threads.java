public class Threads {

    public static void main(String[] args) {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {

                Thread two = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number two");
                        }
                    }
                }
                );
                two.start();
                try {
                    two.join();
                } catch (InterruptedException e) {
                }
                Thread three = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Thread number three");
                        }
                    }
                }
                );
                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                }
            }
        }
        );
        one.start();
    }
}
