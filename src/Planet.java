public class Planet extends CelestialBodies {
    private boolean hasAtmosphere;
    private int moonNumber;

    public Planet(String name, double diameter, int dayDuration, boolean hasAtmosphere, int moonNumber) {
        super(name, diameter, dayDuration);
        this.hasAtmosphere = hasAtmosphere;
        this.moonNumber = moonNumber;
    }
    @Override
    public boolean habitabilityReport(){
        return true;
    }

        }


