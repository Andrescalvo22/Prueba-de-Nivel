
public class Main {
    public static void main(String[] args) {
        CelestialSystem celestialSystem = new CelestialSystem();
        celestialSystem.addBody(new Planet("Earth", 12.742, 24, true, 1));
        celestialSystem.addBody(new Star("Sun", 1.397, 23, 5.778, "G2V"));
        celestialSystem.addBody(new Moon("Moon", 3.474, 22, "Earth", true));

        for (CelestialBodies cb : celestialSystem.getBodies()) {
            System.out.println(cb.getDescription());
        }
    }
}
