package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(56);
        arrayList.add(93);
        arrayList.add(34);
        arrayList.add(32);
        arrayList.add(83);
        arrayList.add(13);
        arrayList.add(27);
        int prod = arrayList.get(0) * arrayList.get(arrayList.size() - 1);
        arrayList.set(0, prod);
        Collections.sort(arrayList);
        System.out.print("New list is:");
        for (int i : arrayList) {
            System.out.print(" " + i);
        }

    }
}
