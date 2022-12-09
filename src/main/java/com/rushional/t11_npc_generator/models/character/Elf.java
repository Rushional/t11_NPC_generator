package com.rushional.t11_npc_generator.models.character;

import com.rushional.t11_npc_generator.models.Sex;

public class Elf extends RpgCharacter {
    public Elf(String name, Sex sex, double height) {
        super(name, sex, height);

    }

    @Override
    public String getRaceAbility() {
        return "I am tall, snarky, good with a longbow and resist charms and stuff. " +
            "By the way, stop bothering me, you pesky human";
    }
}
