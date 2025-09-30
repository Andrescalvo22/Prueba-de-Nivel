public class Planet extends CelestialBodies implements HabitabilityReader {
    private boolean hasAtmosphere;
    private int moonNumber;

    public Planet(String name, double diameter, int dayDuration, boolean hasAtmosphere, int moonNumber) {
        super(name, diameter, dayDuration);
        this.hasAtmosphere = hasAtmosphere;
        this.moonNumber = moonNumber;
    }

    @Override
    public String getDescription() {
        return "Planet: " + getName() +
                ", Diameter: " + getDiameter() + " Km" +
                ", Day Duration: " + getDayDuration() + " Hours" +
                ", Has Atmosphere: " + hasAtmosphere +
                ", Number of Moons: " + moonNumber;
    }

    @Override
    public String habitability() {
        return "This planet is habitable";
    }
}

