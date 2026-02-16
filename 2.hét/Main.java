import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fel(1);
        System.out.println("Add meg a hőmérsékletet: ");
        double temperature =  sc.nextDouble();
        if (temperature >= 30) {
            System.out.println("Túl magas hőmérséklet");
        }else if (temperature >= 0) {
            System.out.println("Átlagos hőmérséklet");
        }else {
            System.out.println("Fagypont alatti hőmérséklet");
        }

        fel(2);
        mpBekeres();

        fel(3);
        System.out.println("Add meg az életkorod:");
        int age =  sc.nextInt();
        System.out.println(String.format("*".repeat(age)));
        System.out.println(String.format("|".repeat(age)));
        System.out.println(String.format("-".repeat(age)));

    }

    public static void fel(int fel_szam) {
        System.out.println(String.format("%d. feladat", fel_szam));
    }

    public static void mpBekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány mp-cel később hallottad a dörgést?");
        int time = sc.nextInt();
        if (time <= 1) {
            mpBekeres();
        }else {
            System.out.println(String.format("%d méterre volt a villám", time*300));
        }
    }
}