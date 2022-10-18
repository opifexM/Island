package com.javarash.creature.animals;

import com.javarash.creature.Creature;
import com.javarash.creature.engine.Eating;
import com.javarash.creature.engine.Mortal;
import com.javarash.creature.engine.Movable;
import com.javarash.creature.engine.Reproducing;
import com.javarash.settings.FamilyIdSettings;

public class Wolf extends Creature implements Eating, Mortal, Movable, Reproducing {

    public Wolf(long id, String name, FamilyIdSettings familyId, double currentWeight) {
        super(id, name, familyId, currentWeight);
    }

}
