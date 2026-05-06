public class CoffeProgram {
    public static void run() {
        System.out.println("\nCoffe Program started"); nl();

        CoffeMachine cm1 = new CoffeMachine("Frei", 210.0, 20);

        System.out.println(cm1); nl();
        System.out.println(cm1.buy(2.5)); nl();
        System.out.println(cm1.buy(25)); nl();
        System.out.println(String.format("Coffe left: %.2f dl", cm1.getQuantity())); nl();
        System.out.println(String.format("Amount that needs to be filled: %.2f dl", cm1.fill())); nl();

        System.out.println("Coffe Program finished\n");
    }

    private static void nl() {
        System.out.println(); //Prints a new empty line
    }
}
