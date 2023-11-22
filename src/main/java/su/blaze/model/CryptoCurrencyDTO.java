package su.blaze.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CryptoCurrencyDTO {
    private String Id;
    private String Label;
    private String CoinCount;
    private String Consensus;
    private String BlockTime;
}
