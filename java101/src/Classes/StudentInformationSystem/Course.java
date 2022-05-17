package Classes.StudentInformationSystem;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (prefix.equals(t.branch)) {
            courseTeacher = t;
            System.out.println("İşlem başarılı!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null)
            System.out.println(name + " dersinin Akademisyeni: " + courseTeacher.name);
        else
            System.out.println(name + " dersine Akademisyen atanmıştır.");
    }
}
