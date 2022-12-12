package com.rushional.t11_npc_generator.models.services;

import com.rushional.t11_npc_generator.models.HeightType;
import com.rushional.t11_npc_generator.models.Race;
import com.rushional.t11_npc_generator.models.Sex;

import java.util.Random;

public class GetRaceHeight {
    private static final double elfAverageHeight = 1.9;
    private static final double manAverageHeight = 1.75;
    private static final double dwarfAverageHeight = 1.45;

    public static double call(Race race, HeightType heightType, Sex sex) {
//        Yeeeah, I kinda wish I was using a later Java version. Why am I not?..
        double height;
        switch (race) {
            case HUMAN:
                height = manAverageHeight;
                break;
            case ELF:
                height = elfAverageHeight;
                break;
            case DWARF:
                height = dwarfAverageHeight;
                break;
            default:
                throw new IllegalArgumentException();
        }
        height = adjustByType(height, heightType);
        if (!(race.equals(Race.DWARF))) {
            if (sex.equals(Sex.FEMALE)) height = feminize(height);
        }
        height = randomizeHeight(height, 3);
        height = Math.round(height * 100) / (double) 100; // round to 2 decimal places
        return height;
    }

    private static double adjustByType(double height, HeightType type) {
        switch (type) {
            case
                BELOW_AVERAGE: return height * 0.91;
            case
                AVERAGE: return height;
            case
                ABOVE_AVERAGE: return height * 1.09;
            default:
                throw new RuntimeException();
        }
    }

    private static double randomizeHeight(double height, int variationPercent) {
        Random random = new Random();
        return height * (1 + variationPercent * 0.01 * (random.nextDouble()*2 - 1));
    }

//    This is a really shitty wat of doing it but I don't care about accuracy.
//    And I'm tired!
    private static double feminize(double maleHeight) {
        return maleHeight * 0.92;
    }
}
