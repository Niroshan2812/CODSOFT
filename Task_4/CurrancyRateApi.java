package Task_4;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrancyRateApi {
    // Setting URL
   private static final String urlApi = "https://v6.exchangerate-api.com/v6/ad2bca1df5c5d21f1bbbb2bf/latest/";

   public double exchanger(String baceCurrancy, String targetCurranct){
       try {
           URL url = new URL(urlApi + baceCurrancy.toUpperCase());
           //System.out.println(url.toString());
           HttpURLConnection con = (HttpURLConnection) url.openConnection();
           con.setRequestMethod("GET");

           int status = con.getResponseCode();
           //System.out.println("\nSending 'GET' request to URL : " + status);
           if(status != 200){
               System.out.println("Currancy rate is " + targetCurranct);
           }
           BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
           String inputLine;
           StringBuilder response = new StringBuilder();
           while ((inputLine = bf.readLine()) != null) {
               response.append(inputLine);
           }
           bf.close();
           con.disconnect();
           System.out.println(response.toString());

           JSONObject obj = new JSONObject (response.toString());
           return obj.getJSONObject("conversion_rates").getDouble(targetCurranct.toUpperCase());

       }
       catch(Exception e){
           System.out.println(e);
       }
       return 0;
   }

}
