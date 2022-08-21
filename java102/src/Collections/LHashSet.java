package Collections;

import java.util.LinkedHashSet;

public class LHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        days.add(null);

        days.remove("Sunday");
        for (String s : days)
            System.out.println(s);
    }
}
