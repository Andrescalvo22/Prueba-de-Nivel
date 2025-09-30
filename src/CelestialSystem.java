import java.util.List;
import java.util.ArrayList;

public class CelestialSystem {
    private List<CelestialBodies> bodies = new ArrayList<>();

    public void addBody(CelestialBodies body) {
        bodies.add(body);
    }

    public List<CelestialBodies> getBodies() {
        return bodies;
    }
}
