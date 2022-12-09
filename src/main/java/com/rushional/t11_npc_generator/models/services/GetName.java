package com.rushional.t11_npc_generator.models.services;

import com.rushional.t11_npc_generator.models.Race;
import com.rushional.t11_npc_generator.models.Sex;

public class GetName {
    private static final String elfMaleName = "Ivariel Fallshadow";
    private static final String elfFemaleName = "Faewenys Dawnmind";
    private static final String humanMaleName = "Bob";
    private static final String humanFemaleName = "Alice";
    private static final String dwarfMaleName = "Toorum";
    private static final String dwarfFemaleName = "Branlyn Giantforce";

    public static String call(Race race, Sex sex) {
        switch (race) {
            case ELF:
                return (sex.equals(Sex.MALE)) ? elfMaleName : elfFemaleName;
            case HUMAN:
                return (sex.equals(Sex.MALE)) ? humanMaleName : humanFemaleName;
            case DWARF:
                return (sex.equals(Sex.MALE)) ? dwarfMaleName : dwarfFemaleName;
            default:
                throw new IllegalArgumentException();
        }
    }
}
