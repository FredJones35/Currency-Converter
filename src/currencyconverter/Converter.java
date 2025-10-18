package currencyconverter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    static Double convert(Double amount,Currency currencyF, Currency currencyT){
        if(CurrencyComparer.checkSame(currencyF,currencyT)){
            return amount;
        }
       
        String url_str = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/" + currencyF;
        HttpClient client = HttpClient.newHttpClient(); //Creates an HTTP client
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url_str)).build(); //Creates an HTTP request using the URL
        double rate = 0;
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Sends the request and decodes received bytes into string
            String jsonResponse = response.body(); // Returns the response body not the header...
           
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonResponse); //Creates JSONObject from text. JSONObject is just a special type of Map<>.
            JSONObject rates = (JSONObject) jsonObject.get("conversion_rates"); //Retrieves value under that key.
            rate = (double) rates.get(currencyT.toString());
        }catch (Exception e){
            System.out.println("problem");
        }
        return amount*rate;
    }
    static Currency intToCurr(int n){
        return Currency.values()[n];
    }
}
