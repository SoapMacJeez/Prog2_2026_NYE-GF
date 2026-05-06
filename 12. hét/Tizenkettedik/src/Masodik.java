import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Masodik {
    public static void run(String first_path,  String second_path) throws IOException {
        System.out.println("Fájl másolása folyamatban...");
        try (FileInputStream fis = new FileInputStream(first_path); FileOutputStream fos = new FileOutputStream(second_path)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("A másolás sikeresen befejeződött");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
