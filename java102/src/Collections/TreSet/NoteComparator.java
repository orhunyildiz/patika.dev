package Collections.TreSet;

import java.util.Comparator;

public class NoteComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getNote() == o2.getNote())
            return o1.getName().compareTo(o2.getName());
        return o1.getNote() - o2.getNote();
    }
}
