package main;

import java.util.*;

// RaceResult interface to define methods for recording and retrieving
interface RaceResult {
    void recordResult(Driver driver, int position, int points);
    int getDriverPoints(Driver driver);
    List<Map.Entry<Driver, Integer>> getResults();
}

// RallyRaceResult class to represent the results of a rally
class RallyRaceResult implements RaceResult {
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
        this.results = new LinkedHashMap<>();
    }

    // Getters
    public String getRaceName() { 
        return raceName;
    }
    public String getLocation() { 
        return location;
 }

    @Override
    public void recordResult(Driver driver, int position, int points) {
        results.put(driver, points);
        driver.addPoints(points);
    }

    @Override
    public int getDriverPoints(Driver driver) {
        return results.getOrDefault(driver, 0);
    }

    @Override
    public List<Map.Entry<Driver, Integer>> getResults() {
        return new ArrayList<>(results.entrySet());
    }
}