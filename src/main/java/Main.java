import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {

        port(4567);
        // endpoint Spark
        new Endpoint().init();

        // credencials

        /*
        MercadoPago.SDK.setClientSecret();
        MercadoPago.SDK.setClientId();
        MercadoPago.SDK.setAccessToken();
        */

    }

}
