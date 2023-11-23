package su.blaze.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import su.blaze.model.CryptoCurrencyDTO;
import su.blaze.model.QuoteDTO;

import java.util.ArrayList;
import java.util.List;

public class CurrencyOrderTest {

    @Test
    public void testASC() {
        List<CryptoCurrencyDTO> list = new ArrayList<>();

        list.add(new CryptoCurrencyDTO("BTC", "Bitcoin", List.of(new QuoteDTO("2023-11-23", 20000.0f))));
        list.add(new CryptoCurrencyDTO("ETH", "Ethereum", List.of(new QuoteDTO("2023-11-23", 1500.0f))));
        list.add(new CryptoCurrencyDTO("XRP", "Ripple", List.of(new QuoteDTO("2023-11-23", 0.5f))));

        List<CryptoCurrencyDTO> sortedList = CurrencyOrder.ASC(list);

        assertEquals(sortedList.get(0).getId(), "XRP");
        assertEquals(sortedList.get(1).getId(), "ETH");
        assertEquals(sortedList.get(2).getId(), "BTC");
    }
}
