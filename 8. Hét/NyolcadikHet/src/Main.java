public class Main {
    public static void main(String[] args) {
        Vehicle[] jarmuvek = new Vehicle[2];
        jarmuvek[0] = new Car();
        jarmuvek[1] = new Bicycle();
        for (Vehicle vehicle : jarmuvek) {
            vehicle.move();
        }
        Dog d1 = new Dog();
        testSound(d1);
        Radio r1 = new Radio();
        testSound(r1);

        Pair<Integer, String> student = new Pair<>(1233, "Végh Béla");
        System.out.println(student.getKey());
        System.out.println(student.getValue());
    }

    static void testSound(SoundMaker sm) {
        sm.makeSound();
    }
}