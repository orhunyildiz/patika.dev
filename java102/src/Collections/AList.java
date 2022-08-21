package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AList {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Gamze");
        nameList.add("Elif");
        nameList.add("Mustafa");
        nameList.add("Umut");
        nameList.add("Umut");
        nameList.add(null);

        System.out.println(nameList);
        System.out.println("Size of List: " + nameList.size());
        System.out.println("Element of 1 Index: " + nameList.get(1));
        System.out.println("Element of 2 Index: " + nameList.get(2));

        System.out.println("Index of 'Umut': " + + nameList.indexOf("Umut"));
        System.out.println("Last Index of 'Umut': " + nameList.lastIndexOf("Umut"));

        nameList.add(3, "Zeynep");
        System.out.println(nameList);

        nameList.set(1, "Naz");
        System.out.println(nameList);

        System.out.println(nameList.contains("Elif"));
        System.out.println(nameList.contains("Mustafa"));

        System.out.println(nameList.remove(4));
        System.out.println(nameList);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.add("Batuhan");
        newNameList.add("Kemal");

        nameList.addAll(newNameList);
        System.out.println(nameList);

        List<String> subList = nameList.subList(4, 6);

        System.out.println("Sublist from name list");
        System.out.println(subList);

        String[] stringArray = nameList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));

        nameList.clear();
        System.out.println(nameList);
    }
}
