import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CelestialSystem implements Iterable<CelestialBodies> {
    private List<CelestialBodies> bodies = new ArrayList<>();

    public void addBody(CelestialBodies body) {
        bodies.add(body);
    }

    public List<CelestialBodies> getBodies() {
        return bodies;
    }

    public List<CelestialBodies> listAll() {
        return bodies;
    }

    public List<Planet> planetsWithAtmosphere() {
        List<Planet> result = new ArrayList<>();
        for (CelestialBodies b : bodies) {
            if (b instanceof Planet p && p.hasAtmosphere()) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Moon> moonsOf(String planetName) {
        List<Moon> result = new ArrayList<>();
        for (CelestialBodies b : bodies) {
            if (b instanceof Moon m && m.getOrbitingPlanet().equalsIgnoreCase(planetName)) {
                result.add(m);
            }
        }
        return result;
    }

    @Override
    public Iterator<CelestialBodies> iterator() {
        return bodies.iterator();
    }
}


