import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Elso {
    public static void run(String path) throws IOException {
    File f1 = new File(path);
    if (f1.exists()) {
        System.out.printf("Filename: %s\n", f1.getName());
        System.out.printf("Absolute path: %s\n", f1.getAbsolutePath());
        System.out.printf("Size of file: %s\n", f1.length());
        System.out.printf("Last modified: %s\n", new Date(f1.lastModified()));
    }else {
        System.out.println("File does not exist");
        f1.createNewFile();
    }

    }
}
