package com.javarash.creature.engine;

import com.javarash.creature.Creature;
import com.javarash.settings.FamilyIdSettings;

public interface Mortal {
    default void startDie(Creature creature) {
        if (isHaveWeight(creature)) {
            FamilyIdSettings familyIdSettings = creature.getFamilyIdSettings();
            lowerWeight(creature, familyIdSettings);
        }
    }

    default void lowerWeight(Creature creature, FamilyIdSettings familyIdSettings) {
        double weight = creature.getCurrentWeight() - familyIdSettings.getWeightLoss();
        creature.setCurrentWeight(weight);
        if (weight <= 0) {
            creature.die();
        }
    }

    default boolean isHaveWeight(Creature creature) {
        return creature.getCurrentWeight() > 0;
    }
}
