import java.io.IOException;

public class Harmadik {
    public static void run() throws IOException {
        TrainTicket t1 = new TrainTicket("Student", 150.3, 50);
        t1.save("saved.bin");
        System.out.println(TrainTicket.load("saved.bin").toString());
    }
}
