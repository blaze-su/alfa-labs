package su.blaze;

import su.blaze.model.CryptoCurrencyDTO;
import su.blaze.util.CurrencyFilter;
import su.blaze.util.JsonReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var sourceCryptoCurrencies = "cryptoCurrencyList.json";
        var currencies = JsonReader.readJsonFile(sourceCryptoCurrencies);

        if (currencies != null) {
            var filteredCurrencies = CurrencyFilter.filterByLabel(currencies, "coin");
            filteredCurrencies.forEach(c -> System.out.println(c.getId()));
        }
    }
}