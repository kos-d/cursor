package lecture2.thread;

import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread {
    @Override
    public void run() {
        int inc = 0;
        
        System.out.println("My Thread impl");
        
//        ArrayList arrayList = new SharedArray().arrayList;
        CopyOnWriteArrayList<String> arrayList = SharedArray.arrayList;

        arrayList.add("Inc2: " + ++inc);
    }
}
