import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Elso.run("./Files/teszt.txt");
        Masodik.run("./Files/teszt.txt", "./Files/teszt2.txt");
        Harmadik.run();
    }
}
