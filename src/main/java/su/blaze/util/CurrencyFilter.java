package su.blaze.util;
import su.blaze.model.CryptoCurrencyDTO;

import java.util.List;
import java.util.stream.Collectors;

public class CurrencyFilter {
    public static List<CryptoCurrencyDTO> filterByLabel(List<CryptoCurrencyDTO> list, String label) {
        return list.stream()
                .filter(c -> c.getLabel().toLowerCase().contains(label.toLowerCase()))
                .collect(Collectors.toList());
    }
}
