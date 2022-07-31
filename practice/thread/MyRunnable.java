package com.cursor.practice.thread;

import com.cursor.practice.SharedArray;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

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
