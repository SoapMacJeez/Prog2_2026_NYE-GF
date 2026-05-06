public class Student {
    static int studentCount;

    public Student() {
        studentCount++;
    }

    public static void print() {
        System.out.println(String.format("Diakok szama: %d", studentCount));
    }
}
