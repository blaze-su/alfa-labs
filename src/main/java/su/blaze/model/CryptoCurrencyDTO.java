package su.blaze.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CryptoCurrencyDTO {
    private String id;
    private String label;
    private List<QuoteDTO> quotes;
}


