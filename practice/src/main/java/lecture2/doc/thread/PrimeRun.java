package lecture2.doc.thread;

public class PrimeRun implements Runnable {
    long minPrime;
    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
        System.out.println("Thread from PrimeRun");
    }
}
