package su.blaze.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CryptoCurrencyDTO {
    private String id;
    private String label;
    private String coinCount;
    private String consensus;
    private String blockTime;
}
