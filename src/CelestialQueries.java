import java.util.List;
import java.util.ArrayList;

public class CelestialQueries {


    public List<CelestialBodies> listAll(CelestialSystem system) {
        return system.getBodies();
    }

    public List<Planet> planetsWithAtmosphere(CelestialSystem system) {
        List<Planet> result = new ArrayList<>();
        for (CelestialBodies b : system.getBodies()) {
            if (b instanceof Planet p && p.hasAtmosphere()) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Moon> moonsOf(CelestialSystem system, String planetName) {
        List<Moon> result = new ArrayList<>();
        for (CelestialBodies b : system.getBodies()) {
            if (b instanceof Moon m && m.getOrbitingPlanet().equalsIgnoreCase(planetName)) {
                result.add(m);
            }
        }
        return result;
    }
}

