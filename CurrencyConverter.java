package Project_biginner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class CurrencyConverter {

	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Enter your amount in Doller: ");
	    	int doller = input.nextInt();
	    	
	        try {
	            String fromCurrency = "USD";
	            String toCurrency = "INR";
	            double amount = doller;

	            String apiKey = "your_api_key"; // Replace with your API key
	            String urlStr = String.format("https://api.exchangerate-api.com/v4/latest/%s", fromCurrency);

	            URL url = new URL(urlStr);
	            HttpURLConnection request = (HttpURLConnection) url.openConnection();
	            request.connect();

	            BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
	            StringBuilder json = new StringBuilder();
	            String line;
	            while ((line = reader.readLine()) != null) {
	                json.append(line);
	            }
	            reader.close();

	            JSONObject jsonObject = new JSONObject(json.toString());
	            double exchangeRate = jsonObject.getJSONObject("rates").getDouble(toCurrency);
	            double convertedAmount = amount * exchangeRate;

	            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

