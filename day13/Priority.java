
package days200;

class PriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}

public class Priority {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        t3.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)

        t1.start();
        t2.start();
        t3.start();
    }
}
