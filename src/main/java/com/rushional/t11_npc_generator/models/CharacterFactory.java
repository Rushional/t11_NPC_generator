package com.rushional.t11_npc_generator.models;

import com.rushional.t11_npc_generator.models.character.Dwarf;
import com.rushional.t11_npc_generator.models.character.Elf;
import com.rushional.t11_npc_generator.models.character.Human;
import com.rushional.t11_npc_generator.models.character.RpgCharacter;
import com.rushional.t11_npc_generator.models.services.GetName;
import com.rushional.t11_npc_generator.models.services.GetRaceHeight;

public class CharacterFactory {
//    Kinda want to test this with PowerMockito, but don't want to stretch myself too thin
    public static RpgCharacter getCharacter(Race race, Sex sex, HeightType heightType) {
        String name = GetName.call(race, sex);
        switch (race) {
            case ELF:
                return new Elf(name, sex, GetRaceHeight.call(Race.ELF, heightType, sex));
            case HUMAN:
                return new Human(name, sex, GetRaceHeight.call(Race.HUMAN, heightType, sex));
            case DWARF:
                return new Dwarf(name, sex, GetRaceHeight.call(Race.DWARF, heightType, sex));
            default:
                throw new RuntimeException();
        }
    }
}
