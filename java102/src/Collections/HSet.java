package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("z");
        hashSet.add(null);
        hashSet.add("s");

        hashSet.remove("b");
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("b"));
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("***");
        //Printing with Iterator
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
