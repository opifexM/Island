package com.javarash.creature.animals;

import com.javarash.creature.Creature;
import com.javarash.creature.engine.Eating;
import com.javarash.creature.engine.Mortal;
import com.javarash.creature.engine.Reproducing;
import com.javarash.settings.FamilyIdSettings;

public class Caterpillar extends Creature implements Mortal, Reproducing, Eating {
    public Caterpillar(long id, String name, FamilyIdSettings familyId, double currentWeight) {
        super(id, name, familyId, currentWeight);
    }
}
