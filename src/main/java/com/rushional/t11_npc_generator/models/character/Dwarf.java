package com.rushional.t11_npc_generator.models.character;

import com.rushional.t11_npc_generator.models.Sex;

public class Dwarf extends RpgCharacter {
    public Dwarf(String name, Sex sex, double height) {
        super(name, sex, height);
    }

    @Override
    public String getRaceAbility() {
        return "I am short, wide, strong, and I feel caves in a deep and mysterious way. " +
            "I can communicate with the very spirit of a cave!";
    }
}
