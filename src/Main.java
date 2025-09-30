public class Main {
    public static void main(String[] args) {

        CelestialSystem system = new CelestialSystem();
        system.addBody(new Planet("Earth", 12742, 24, true, 1));
        system.addBody(new Star("Sun", 1397000, 23, 5778, "G2V"));
        system.addBody(new Moon("Moon", 3474, 22, "Earth", true));

        HabitabilityPrinter printer = new HabitabilityPrinter();


        System.out.println("All Celestial Bodies: ");
        for (CelestialBodies b : system.listAll()) {
            System.out.println(b.getDescription());
        }


        System.out.println("\n Planets with Atmosphere: ");
        for (Planet p : system.planetsWithAtmosphere()) {
            System.out.println(p.getDescription());
        }


        System.out.println("\n Moons that orbit Earth: ");
        for (Moon m : system.moonsOf("Earth")) {
            System.out.println(m.getDescription());
        }


        System.out.println("\n Habitability Report: ");
        for (CelestialBodies b : system) {
            if (b instanceof Habitable hab) {
                printer.printReport(hab);
            }
        }
    }
}
