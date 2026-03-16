package main;

import java.util.*;

// ChampionshipManager class to manage the rally championship
public class ChampionshipManager {
    private static ChampionshipManager instance;
    private List<Driver> drivers = new ArrayList<>();
    private List<RallyRaceResult> races = new ArrayList<>();
    private static int totalRaces = 0;
    private static int totalDrivers = 0;

    // Private constructor for singleton pattern
    private ChampionshipManager() {
    }

    // Method to get the singleton instance of ChampionshipManager
    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    // Method to register a driver in the championship
    public void registerDriver(Driver driver) {
        drivers.add(driver);
        totalDrivers++;
    }

    // Method to add a race result to the championship
    public void addRaceResult(RallyRaceResult result) {
        races.add(result);
        totalRaces++;
    }

    // Method to get the current standings of drivers based on points
    public List<Driver> getDriverStandings() {
        drivers.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return drivers;
    }

    // Method to get the leading driver in the championship
    public Driver getLeadingDriver() {
        return getDriverStandings().get(0);
    }

    // Method to get the list of race results
    public List<RallyRaceResult> getRaceResults() {
        return races;
    }

    // Method to calculate total championship points
    public int getTotalChampionshipPoints(){
        return drivers.stream().mapToInt(Driver::getPoints).sum();
    }

    // Getters for total drivers and total races
    public int getTotalDrivers() {
        return totalDrivers;
    }

    public int getTotalRaces() {
        return totalRaces;
    }




}

