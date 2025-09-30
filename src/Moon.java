public class Moon extends CelestialBodies implements Habitable {
    private String orbitingPlanet;
    private boolean hasRockySurface;

    public Moon(String name, double diameter, int durationDay, String orbitingPlanet, boolean hasRockySurface) {
        super(name, diameter, durationDay);
        this.orbitingPlanet = orbitingPlanet;
        this.hasRockySurface = hasRockySurface;
    }

    public String getOrbitingPlanet() {
        return orbitingPlanet;
    }

    @Override
    public String getDescription() {
        return "Name: " + getName() +
                ", Diameter: " + getDiameter() + " Km " +
                ", Day Duration: " + getDayDuration() + " Hours " +
                ", Orbiting planet: " + orbitingPlanet +
                ", It has rocky surface? " + hasRockySurface;

    }

    @Override
    public String getHabitability() {
        return "Moon is habitable";
    }
}
