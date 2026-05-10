public class Main {
    public static void main(String[] args) {
        WebClient client = new WebClient();
        client.connect();
        Car c1 = new Car("gas");
        sayHello();
    }

    public static void sayHello() {
        Message instance = new Message() {
            @Override
            public void sayHello() {
                System.out.println("Hello from the inner world!");
            }
        };
        instance.sayHello();
    }
}