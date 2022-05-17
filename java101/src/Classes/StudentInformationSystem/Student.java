package Classes.StudentInformationSystem;

public class Student {
    String name, stdNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stdNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matVerbal, int fizik, int fizikVerbal, int kimya, int kimyaVerbal) {
        if (mat >= 0 && mat <= 100)
            this.mat.note = mat;
        if (matVerbal >= 0 && fizikVerbal <= 100)
            this.mat.verbalNote = matVerbal;
        if (fizik >= 0 && fizik <= 100)
            this.fizik.note = fizik;
        if (fizikVerbal >= 0 && fizikVerbal <= 100)
            this.fizik.verbalNote = fizikVerbal;
        if (kimya >= 0 && kimya <= 100)
            this.kimya.note = kimya;
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100)
            this.kimya.verbalNote = kimyaVerbal;
    }

    public void isPass() {
        if (mat.note == 0 || fizik.note == 0 || kimya.note == 0 || mat.verbalNote == 0 || fizik.verbalNote == 0 || kimya.verbalNote == 0)
            System.out.println("Notlar tam olarak girilmemiş!");
        else {
            isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + average);
            if (isPass)
                System.out.println("Sınıfı Geçti!");
            else
                System.out.println("Sınıfta Kaldı!");
        }
    }

    public void calcAverage() {
        average = (((fizik.verbalNote * 0.20) + (fizik.note * 0.80)) + ((mat.verbalNote * 0.20) + (mat.note * 0.80)) + ((kimya.verbalNote * 0.20) + (kimya.note * 0.80))) / 3.0;

    }

    public boolean isCheckPass() {
        calcAverage();
        return average >= 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + name);
        System.out.println("Matematik Notu : " + mat.note);
        System.out.println("Matematik Sözlü Notu : " + mat.verbalNote);
        System.out.println("Fizik Notu : " + fizik.note);
        System.out.println("Fizik Sözlü Notu : " + fizik.verbalNote);
        System.out.println("Kimya Notu : " + kimya.note);
        System.out.println("Kimya Sözlü Notu : " + kimya.verbalNote);
    }
}
