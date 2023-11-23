package su.blaze.util;

import su.blaze.model.CryptoCurrencyDTO;
import su.blaze.model.QuoteDTO;

import java.util.List;

public class CurrencyOrder {
    public static List<CryptoCurrencyDTO> ASC(List<CryptoCurrencyDTO> list) {
        list.sort((a, b) -> {
            // Проверяем, есть ли котировки в списках
            if (a.getQuotes().isEmpty() || b.getQuotes().isEmpty()) {
                return 0; // Можно рассмотреть другую логику обработки для этого случая
            }

            QuoteDTO quote1 = a.getQuotes().get(0);
            QuoteDTO quote2 = b.getQuotes().get(0);

            // Сравниваем цены
            return quote1.getPrice().compareTo(quote2.getPrice());
        });
        return list;
    }
}