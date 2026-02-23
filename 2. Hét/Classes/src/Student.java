import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;
    private double average;
    private String rp;

    public Student(String student_name) {
        this.name = student_name;
        this.grades = new ArrayList<>();
        this.average = 0;
        this.rp = "-".repeat(40); //Row pattern to print
    }

    public void add_a_grade(double grade_to_add) {
        grades.add(grade_to_add);
        System.out.println(String.format("%.2f grade added", grade_to_add));
        calc_average();
    }

    public void show_average() {
        System.out.println(String.format("%s \n%s's grades' average: %.2f \n%s", this.rp, this.name, this.average, this.rp));
    }

    private void calc_average() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        this.average = sum / grades.size();
    }
}
