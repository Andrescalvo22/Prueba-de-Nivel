public class Main {
    public static void main(String[] args) {
        CelestialSystem system = new CelestialSystem();
        system.addBody(new Planet("Earth", 12742, 24, true, 1));
        system.addBody(new Star("Sun", 1397000, 23, 5778, "G2V"));
        system.addBody(new Moon("Moon", 3474, 22, "Earth", true));

        CelestialQueries queries = new CelestialQueries();
        HabitabilityPrinter printer = new HabitabilityPrinter();

        System.out.println(" Descriptions: ");
        System.out.println(" ");
        for (CelestialBodies body : system.getBodies()) {
            System.out.println(body.getDescription());
        }

        System.out.println(" ");
        System.out.println("Habitability Report: ");
        System.out.println(" ");
        for (CelestialBodies body : system.getBodies()) {
            if (body instanceof Habitable habitable) {
                printer.printReport(habitable);
                System.out.println();
            }
        }
    }
}
