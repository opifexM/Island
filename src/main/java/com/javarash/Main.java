package com.javarash;


import com.javarash.settings.GlobalSettings;
import com.javarash.utils.Color;
import com.javarash.utils.Logger;
import com.javarash.world.Statistics;
import com.javarash.world.World;

import java.io.IOException;

public class Main {
    public static final String SETTINGS_FILE = "GlobalSettings.yaml";
    public static final String ISLAND_LOG_FILE = "Island.log";
    public static final String DATA_FORMAT = "HH:mm:ss";
    public static final int LOWER_NUMBER_OF_ANIMALS = 1;
    public static final int PAUSE_MILLIS = 1000;


    public static void main(String[] args) throws IOException {

        Logger logger = new Logger(ISLAND_LOG_FILE, DATA_FORMAT);
        Color color = new Color();

        GlobalSettings globalSettings = new GlobalSettings();
        // Create Default Setting File
        globalSettings.defaultSettingFile(SETTINGS_FILE);
        // Load Setting File
        globalSettings = globalSettings.loadSettingFile(SETTINGS_FILE);

        World world = new World(logger, globalSettings);
        world.startGenerating(LOWER_NUMBER_OF_ANIMALS);

        Statistics statistics = new Statistics(world, globalSettings, color, logger);
        statistics.initialization();

        while (true) {
            statistics.display();
            world.act();
            if (world.getTotalLiveCreatures() == 0) {
                break;
            }
            try {
                //noinspection BusyWait
                Thread.sleep(PAUSE_MILLIS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}