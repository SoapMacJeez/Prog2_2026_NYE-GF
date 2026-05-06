import java.io.*;

public class TrainTicket {
    private String type;
    private double distance;
    private int pricePerKm;

    public TrainTicket() {
    }

    public TrainTicket(String type, double distance, int pricePerKm) {
        this.type = type;
        this.distance = distance;
        this.pricePerKm = pricePerKm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(int pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void save(String filename) throws FileNotFoundException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeUTF(type);
            dos.writeDouble(distance);
            dos.writeInt(pricePerKm);

            System.out.println("Data saved to " + filename);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static TrainTicket load(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Adatok beolvasása:");
            String type = dis.readUTF();
            double distance = dis.readDouble();
            int pricePerKm = dis.readInt();

            return new TrainTicket(type, distance, pricePerKm);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("Type: %s \nDistance: %.2f \nPricePerKm: %d\n", this.type, this.distance, this.pricePerKm);
    }

}
