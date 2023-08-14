public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Aglamaz", "MAT", "5454545454");
        Teacher t2 = new Teacher("Zehra Gundogdu", "FZK", "5452323232");
        Teacher t3 = new Teacher("Kerim Solak", "KMY", "5522525252");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Students s1 = new Students("Samet Aslan", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,50,80,65,45,40);
        s1.isPass();

        Students s2 = new Students("Halide Varol", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,95,80,75,65,45);
        s2.isPass();

        Students s3 = new Students("Ali Can", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(45,45,35,25,75,80);
        s3.isPass();

    }
}