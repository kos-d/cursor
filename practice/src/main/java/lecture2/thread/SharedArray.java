package lecture2.thread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class SharedArray {
//    public ArrayList arrayList = new ArrayList();
    public static CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList();
}