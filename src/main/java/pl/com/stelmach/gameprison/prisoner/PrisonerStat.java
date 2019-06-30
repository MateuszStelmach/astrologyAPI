package pl.com.stelmach.gameprison.prisoner;

import lombok.Getter;
import lombok.Setter;
import pl.com.stelmach.gameprison.astrologyinfluance.BirthChart;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class PrisonerStat {
    private Map<CharacterQuality, Integer> prisonerStat;

    public PrisonerStat(BirthChart birthChart) {
        prisonerStat = new HashMap<>();
        for (CharacterQuality characterQuality : CharacterQuality.values()) {
            prisonerStat.put(characterQuality, characterQuality.qualityStrentgh(birthChart));
        }
    }

}

