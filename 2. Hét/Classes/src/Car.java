public class Car {
    private String brand, model;
    private int year;
    private String rp;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rp = "-".repeat(40); //Row pattern to print
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start_engine() {
        System.out.println("The engine is starting");
    }

    public void stop_engine(){
        System.out.println("The engine is stopping");
    }

    public void show_details() {
        System.out.println(String.format("%s \nBrand: %s \nModel: %s \nYear of production: %d \n%s", this.rp, this.brand, this.model, this.year, this.rp));;
    }
}
