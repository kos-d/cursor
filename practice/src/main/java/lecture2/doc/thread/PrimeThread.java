package lecture2.doc.thread;

public class PrimeThread extends Thread {
    long minPrime;
    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }
    @Override
    public void run() {
        System.out.println("Thread from PrimeThread");
    }
}
