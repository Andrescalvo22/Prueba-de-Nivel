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


    @Override
    public String toString() {
        return "Celestial Body: " + name +
                " , it has a diameter of: " + diameter + " Km" +
                ", the duration day here is: " + dayDuration + " Hours";
    }

    public abstract boolean habitabilityReport();


}
