import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private static Object conversor;
    private static final Object USD = conversor;
    private static Object Conversor;

    public CurrencyConverter(Object usd) {

    }

    public <InterruptedExceptione> Conversor conversorDeMoeda(Object conversor){
        URI Conversor = URI.create("https://v6.exchangerate-api.com/v6/4827787e48b51c3ef1c7f5c7/latest/USD" +  "/json");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(Conversor)
                .build();


        try {
            HttpResponse<String> response;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("Não Consegui converter!", e);
        }


    }

    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter(USD);
        Conversor conversor = currencyConverter.conversorDeMoeda(Conversor);
        System.out.println(conversor);
    }
}
