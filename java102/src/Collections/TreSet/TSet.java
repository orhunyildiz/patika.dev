package Collections.TreSet;

import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new NoteComparator());

        students.add(new Student("Nustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 60));
        students.add(new Student("Ahmet", 10));

        for (Student student : students)
            System.out.println(student.getName());
    }
}
