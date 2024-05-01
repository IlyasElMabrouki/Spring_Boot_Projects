import jakarta.xml.ws.Endpoint;
import ws.BankService;


public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:9090/";
        Endpoint.publish(url, new BankService());
    }
}
