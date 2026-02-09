public class Main {
    //Function to print out the number of each exercise
    public static void ex(int x) {
    System.out.println(String.format(
        "%d. feladat",
        x
    ));
}
    public static void main(String[] args) {
        //Exercise 2
        ex(2);
        Human me = new Human("Gazdóf Ferenc", "VOSR1F");
        System.out.println(String.format(
            "%s \n%s \n\"Aspera ad Astra\"", 
            me.getName(), me.getId()
        ));

        //Exercise 3
        ex(3);
        Guitar myGuitar = new Guitar("Fender Squier", "Bulletstrat (2002 Anniversary Edition)", 6);
        System.out.println(myGuitar);
    }
}

class Human {
    private String name;
    private String neptun_id;

    public Human (String name, String neptun_id) {
        this.name = name;
        this.neptun_id = neptun_id;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.neptun_id;
    }
}

class Guitar {
    private String make, model;
    private int stringCount;

    //Constructor of all arguments
    public Guitar(String make, String model, int stringCount) {
        this.make = make;
        this.model = model;
        this.stringCount = stringCount;
    }

    //Constructor of no arguments
    public Guitar() {

    }

    //Getters
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getStringCount() {
        return this.stringCount;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStringCount(short count) {
        this.stringCount = count;
    }

    //To String for easier commandline output
    public String toString() {
        return String.format(
            "Make: %s\n" +
            "Model: %s\n" +
            "Number of strings: %d",
            this.make, this.model, this.stringCount
        );
    }

    //Functional methods
    public void play_a_song(String song) {

    }

    public void changeStrings() {

    }
}
