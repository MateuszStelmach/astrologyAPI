package com.gameprison.prisoner;

import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Getter
public class PrisonerStat {
    private Map<CharacterQuality, Integer> prisonerStat;
}

