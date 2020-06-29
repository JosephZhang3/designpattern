package FactoryMethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ShowIterator {

    public static void main(String[] args) {
        List list = Arrays.asList("zebulon","Luyis");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
