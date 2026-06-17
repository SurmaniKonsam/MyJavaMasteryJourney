package DailyDSAExercise;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> System.out.println("Run");
        Runnable runnable2 = () -> System.out.println("Walk");
        Runnable runnable3 = () -> System.out.println("Crawl");
        Runnable runnable4 = () -> System.out.println("Fly");
        Runnable runnable5 = () -> System.out.println("Jump");

        Thread[] threads = new Thread[5];

        /**
         * Assigning runnable to the threads
         */
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        Thread thread4 = new Thread(runnable4);
        Thread thread5 = new Thread(runnable5);

        threads[0] = thread1;
        threads[1] = thread2;
        threads[2] = thread3;
        threads[3] = thread4;
        threads[4] = thread5;

        for(Thread t : threads){
            t.start();
        }


    }




}
