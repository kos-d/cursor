package lecture2.thread;

import java.util.concurrent.CopyOnWriteArrayList;
import lecture2.SharedArray;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        
        int increment = 0;
        
        System.out.println("My Thread");
        
//        ArrayList arrayList = new SharedArray().arrayList;
        CopyOnWriteArrayList<String> arrayList = SharedArray.arrayList;
        
        
        
        arrayList.add("Inc: " + ++increment);
    }
}
