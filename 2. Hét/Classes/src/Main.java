public class Main {
    public static void main(String[] args) {
        fel(1);
        Car car1 = new Car("Opel", "Astra G", 2003);
        car1.show_details();
        car1.start_engine();
        car1.stop_engine();
        newLine();
        fel(2);
        Student s1 = new Student("Francis");
        s1.add_a_grade(2);
        s1.add_a_grade(3);
        s1.add_a_grade(5);
        s1.add_a_grade(5);
        s1.show_average();

        System.out.println(MathUtils.multiply(2, 3));
        System.out.println(MathUtils.multiply(2,2,2));
    }
    private static void newLine() {
        System.out.println();
    }
    private static void fel(int num) {
        System.out.println(String.format("%d. feladat", num));
    }
}