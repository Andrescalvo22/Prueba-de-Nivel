public abstract class CelestialBodies {
    private String name;
    private double diameter;
    private int dayDuration;

    public CelestialBodies(String name, double diameter, int dayDuration) {
        this.name = name;
        this.diameter = diameter;
        this.dayDuration = dayDuration;

    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public abstract String getDescription();
}
