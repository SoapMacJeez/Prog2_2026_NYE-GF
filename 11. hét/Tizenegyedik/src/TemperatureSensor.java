public class TemperatureSensor {
    static double temperature = 0.0;
    public static void setTemperature(double temp) {
        if (temp < -273.15) {
            throw new IllegalArgumentException("Ez a hőmérséklet alacsonyabb, mint az abszolút 0, nice try dagi ;p");
        } else {
            temperature = temp;
        }
    }
}
