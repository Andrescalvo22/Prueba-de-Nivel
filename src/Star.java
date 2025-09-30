public class Star extends CelestialBodies {
    private double temperature;
    private String spectralType;

    public Star(String name, double diameter, int dayDuration, double temperature, String spectralType) {
        super(name, diameter, dayDuration);
        this.temperature = temperature;
        this.spectralType = spectralType;
    }

    @Override
    public boolean habitabilityReport() {
        return false;
    }
}
