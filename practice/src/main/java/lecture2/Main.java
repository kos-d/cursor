package lecture2;

import lecture2.thread.MyRunnable;
import lecture2.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        
        MyThread myThread = new MyThread();
        
        Thread thread = new Thread(new MyRunnable());
        
        thread.run();
        myThread.run();
        
        System.out.println(new SharedArray().arrayList.get(0));
        
    }
}
