package com.rushional.t11_npc_generator.models.character;

import com.rushional.t11_npc_generator.models.Sex;

public class Human extends RpgCharacter {
    public Human(String name, Sex sex, double height) {
        super(name, sex, height);
    }

    @Override
    public String getRaceAbility() {
        return "You might think I'm boring and basic, but I get a free feat or some stats! " +
            "That's cool, right?.. Right?....";
    }
}
