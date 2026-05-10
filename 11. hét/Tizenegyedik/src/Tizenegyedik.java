public class Tizenegyedik {
    public static void run() {
        System.out.println("Elso feladat");
        try {
            TemperatureSensor.setTemperature(-300);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.out.println();
        }

        System.out.println("Masodik feladat");
        try {
            processData("", 10);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
            System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println();
        }

        try {
            processData("shit", 10);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
            System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println();
        }

        try {
            processData("Almafa alatt kaka", 10);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
            System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println();
        }

        Validator.checkPassword("fasz");
    }

    static void processData(String input, int index) {
        if (input.isBlank()) {
            throw new NullPointerException("Input is blank");
        } else if (index >= input.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        } else {
            System.out.println("Siker");
        }
    }
}
