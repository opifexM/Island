package com.javarash.creature.animals;

import com.javarash.creature.Creature;
import com.javarash.creature.engine.Reproducing;
import com.javarash.settings.FamilyIdSettings;
import com.javarash.settings.GlobalSettings;
import com.javarash.world.Tile;

public class Plants extends Creature implements Reproducing {
    public Plants(long id, String name, FamilyIdSettings familyId, double currentWeight) {
        super(id, name, familyId, currentWeight);
    }

    @Override
    public boolean isSameFamilyInTile(FamilyIdSettings familyIdSettings, Tile tile) {
        return true;
    }

    @Override
    public boolean checkHungryStatus(Creature creature, FamilyIdSettings familyIdSettings) {
        return true;
    }

    @Override
    public boolean checkReproductionChange(GlobalSettings globalSettings) {
        return true;
    }
}
