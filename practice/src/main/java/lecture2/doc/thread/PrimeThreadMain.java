package lecture2.doc.thread;

public class PrimeThreadMain {
    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread(143);
        primeThread.start();
        
        PrimeRun primeRun = new PrimeRun(143);
        new Thread(primeRun).start();
    }
}