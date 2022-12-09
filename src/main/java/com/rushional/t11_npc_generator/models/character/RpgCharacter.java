package com.rushional.t11_npc_generator.models.character;

import com.rushional.t11_npc_generator.models.Sex;
import lombok.Getter;

@Getter
public abstract class RpgCharacter {
    private String name;
    private Sex sex;
    private double height;

    public RpgCharacter(String name, Sex sex, double height) {
        this.name = name;
        this.sex = sex;
        this.height = height;
    }


    public abstract String getRaceAbility();
}
