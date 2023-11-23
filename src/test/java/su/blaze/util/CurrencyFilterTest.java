package su.blaze.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import su.blaze.model.CryptoCurrencyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyFilterTest {

    private List<CryptoCurrencyDTO> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add(new CryptoCurrencyDTO("BTC", "Bitcoin", Collections.emptyList()));
        list.add(new CryptoCurrencyDTO("ETH", "Ethereum", Collections.emptyList()));
        list.add(new CryptoCurrencyDTO("DOGE", "Dogecoin", Collections.emptyList()));
    }

    @Test
    void testFilterByLabelPartCase() {
        List<CryptoCurrencyDTO> result = CurrencyFilter.filterByLabel(list, "coin");
        assertEquals(2, result.size());
        assertEquals("BTC", result.get(0).getId());
        assertEquals("DOGE", result.get(1).getId());
    }

    @Test
    void testFilterByLabelExactCase() {
        List<CryptoCurrencyDTO> result = CurrencyFilter.filterByLabel(list, "Bitcoin");
        assertEquals(1, result.size());
        assertEquals("BTC", result.get(0).getId());
    }

    @Test
    void testFilterByLabelLowerCase() {
        List<CryptoCurrencyDTO> result = CurrencyFilter.filterByLabel(list, "bitcoin");
        assertEquals(1, result.size());
        assertEquals("BTC", result.get(0).getId());
    }

    @Test
    void testFilterByLabelUpperCase() {
        List<CryptoCurrencyDTO> result = CurrencyFilter.filterByLabel(list, "BITCOIN");
        assertEquals(1, result.size());
        assertEquals("BTC", result.get(0).getId());
    }

    @Test
    void testFilterByLabelNoMatch() {
        List<CryptoCurrencyDTO> result = CurrencyFilter.filterByLabel(list, "Litecoin");
        assertTrue(result.isEmpty());
    }
}