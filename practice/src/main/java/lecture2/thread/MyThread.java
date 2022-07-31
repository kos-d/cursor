package com.cursor.practice.thread;

import com.cursor.practice.SharedArray;
import java.util.ArrayList;
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
