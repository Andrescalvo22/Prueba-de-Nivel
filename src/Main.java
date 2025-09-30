import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<CelestialBodies> celestialBodies = new ArrayList<>();
        celestialBodies.add(new Planet("Earth", 12.742, 24, true, 1));
        celestialBodies.add(new Star("Sun", 1.397, 23, 5.778, "G2V"));
        celestialBodies.add(new Moon("Moon", 3.474, 22, "Earth", true));

        for (CelestialBodies cb : celestialBodies) {
            System.out.println(cb.toString());
        }
        System.out.println("-----");

        for (CelestialBodies cb : celestialBodies) {

            System.out.println("Habitability of Earth, Sun, and Moon respectively: " +
                    cb.habitabilityReport());
        }


    }
}