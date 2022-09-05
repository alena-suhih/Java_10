import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation = 0;
    private int currentVolume = 0;
    private int quantityStation = 10;
    private int minNumberStation = 0;
    private int maxNumberStation = quantityStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
}