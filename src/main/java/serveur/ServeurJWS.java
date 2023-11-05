package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

    public class ServeurJWS {
    public static void main(String[] args) {
        String URL="http://localhost:8084/";
        CalculatriceWS C = new CalculatriceWS();
        Endpoint.publish(URL, C);
    }
}
