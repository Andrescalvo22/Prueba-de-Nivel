public class Star extends CelestialBodies {
    private double temperature;
    private String spectralType;

    public Star(String name, double diameter, int dayDuration, double temperature, String spectralType) {
        super(name, diameter, dayDuration);
        this.temperature = temperature;
        this.spectralType = spectralType;
    }

    @Override
    public String getDescription() {
        return "Name: " + getName() +
                ", Diameter: " + getDiameter() + " million Km " +
                ", Day Duration: " + getDayDuration() + " Hours " +
                ", Temperature: " + temperature + " K " +
                ", Spectral Type: " + spectralType;
    }
}



