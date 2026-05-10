import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FisFos {
    public static void run() {
        String srcf = "./test_files/test.txt", tarf = "./test_files/test2.txt";
        try (
                FileInputStream fis = new FileInputStream(srcf);
                FileOutputStream fos = new FileOutputStream(tarf)
                ) {
                    int dat;
                    while ((dat = fis.read()) != -1) {
                        fos.write(dat);
                    }
                    System.out.println("A másolás sikeresen megtörtént!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
