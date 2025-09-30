public class Moon extends CelestialBodies {
    private String orbitingPlanet;
    private boolean hasRockySurface;

    public Moon(String name, double diameter, int durationDay, String orbitingPlanet, boolean hasRockySurface) {
        super(name, diameter, durationDay);
        this.orbitingPlanet = orbitingPlanet;
        this.hasRockySurface = hasRockySurface;
    }
    @Override
    public boolean habitabilityReport() {
        return false;
    }
}
