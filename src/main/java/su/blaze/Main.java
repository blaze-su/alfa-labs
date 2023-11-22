package su.blaze;

import su.blaze.model.CryptoCurrencyDTO;
import su.blaze.util.JsonReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        var sourceCryptoCurrencies = "cryptoCurrencyList.json";
        List<CryptoCurrencyDTO> currencies = JsonReader.readJsonFile(sourceCryptoCurrencies);

        if (currencies != null) {
            currencies.forEach(c -> System.out.println(c.getId()));
        }
    }
}