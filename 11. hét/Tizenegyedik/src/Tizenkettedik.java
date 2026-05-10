import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

public class Tizenkettedik {
    public static void run(){
        try {
            fileExplorer("./test_files/test.txt");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void fileExplorer(String path) throws FileNotFoundException {
        File file = new File(path);
        if(file.exists()){
            System.out.printf("Filename: %s\n", file.getName());
            System.out.printf("Absolute path: %s\n", file.getAbsolutePath());
            System.out.printf("Size (in bytes): %d\n", file.length());
            System.out.printf("Last modifiied: %s\n", new Date(file.lastModified()));
        } else {
            throw new FileNotFoundException("File does not exist");
        }
    }
}
