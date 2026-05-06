import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        /*
        * //Elso feladat
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Bence");
        names.add("Cecil");
        names.add("Dani");
        names.add("Emese");
        names.remove(2);
        for (String name : names) {
            System.out.println(name);
        }

        //Masodik feladat
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            nums.add(i);
        }
        int i = 0;
        do {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
            i++;
        }while (i < nums.size());
        for (Integer num : nums) {
            System.out.println(num);
        }

        //Harmadik feladat
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Sátántangó", "László Krasznahorkai"));
        books.add(new Book("Vuk", "István Fekete"));
        System.out.println(findBookByTitle(books, "Vuk"));
        System.out.println(findBookByTitle(books, "Vuka"));*/
    }//end of main()

    public static Book findBookByTitle(List<Book> library, String title) {
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public static void updateInventory(List<String> inventory, String oldItem, String newItem) {
        if (inventory.contains(oldItem)) {
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i).equals(oldItem)) {inventory.set(i, newItem);}
            }
        }else{
            inventory.add(oldItem);
        }
        Collections.sort(inventory);
    }

    public static ArrayList<Integer> getkaka(int[] arr) {
        ArrayList<Integer> kaka = new ArrayList<>();
        for (int num : arr) {
            kaka.add(num);
        }
    }
}//End of Main
