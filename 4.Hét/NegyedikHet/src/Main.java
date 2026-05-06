import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int countVowels(String text) {
        String tempText = text.toLowerCase();
        int db = 0;
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < text.length(); i++) {
            if (chars.contains(tempText.charAt(i))) {
                db++;
            }
        }
        return db;
    }
    public static void main(String[] args) {
        System.out.printf("%d magangangzo", countVowels("Alma"));

        /*
        Scanner sc = new Scanner(System.in);
        fel(1);

        int elso, masodik;
        double eredmeny;

        System.out.println("Irj be egy muveletsort(pl.: 3 + 2):");
        String[] line = sc.nextLine().split(" ");
        elso = Integer.parseInt(line[0]);
        masodik = Integer.parseInt(line[2]);
        eredmeny = switch (line[1]) {
            case "+" -> elso + masodik;
            case "-" -> elso - masodik;
            case "*" -> elso * masodik;
            case "/" -> (double) elso / masodik;
            default -> Double.MIN_VALUE;
        };
        System.out.printf("\nEredmeny: %.2f\n", eredmeny);

        fel(2);
        int szam, tipp;
        szam = (int) (Math.random() * 100) + 1;
        System.out.println("Tippelj s megmondom, kisebb e a kitalalando szam, vagy nagyobb!");
        tipp = sc.nextInt();
        boolean tovabb = true;
        while (tovabb) {
            if (tipp < szam) {
                System.out.println("Nagyobb");
                tipp = sc.nextInt();
            }else if (tipp > szam) {
                System.out.println("Kisebb");
                tipp = sc.nextInt();
            }else {
                System.out.println("Talalt!");
                tovabb = false;
            }
        }
         */


    }//End of main

    public static void fel(int fel_sz) {
        System.out.printf("\n%d. feladat\n", fel_sz);
    }
}