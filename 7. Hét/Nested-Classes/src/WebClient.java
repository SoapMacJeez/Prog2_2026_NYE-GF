public class WebClient {

    public void connect() {
        System.out.println(String.format(
                "Url: %s \nTimeout: %d ms",
                Config.url, Config.timeout
        ));
    }

    static class Config {
        static int timeout = 2;
        static String url = "https://www.google.com";
    }


}
