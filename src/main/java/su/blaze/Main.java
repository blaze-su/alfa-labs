package su.blaze;

import su.blaze.util.CurrencyFilter;
import su.blaze.util.CurrencyOrder;
import su.blaze.util.JsonReader;


public class Main {
    public static void main(String[] args) {
        var sourceCryptoCurrencies = "cryptoCurrencyList.json";
        var currencies = JsonReader.readJsonFile(sourceCryptoCurrencies);

        if (currencies != null) {
            var filteredCurrencies = CurrencyFilter.filterByLabel(currencies, "coin");
            var orderedCurrencies = CurrencyOrder.ASC(filteredCurrencies);
            orderedCurrencies.forEach(c -> System.out.println(c.getId()));
        }
    }
}