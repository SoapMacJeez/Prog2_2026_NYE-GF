import java.util.Scanner;
import java.util.TreeSet;

public class Control {
    public static void run() {
        TreeSet<String> names = new TreeSet<>();

        String name = getName();
        while (!name.equalsIgnoreCase("exit")) {
            if (!name.isBlank()) {
                names.add(name);
            }
            name = getName();
        }

        for (String s : names) {
            System.out.println(s);
        }
    }

    private static String getName() {
        System.out.println("Adj meg egy nevet: \n");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
