package satellite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Controller {
    private List<GenericSatellite> satellites = new ArrayList<>();

    public void addSatellite(GenericSatellite satelliteToAdd) {
        this.satellites.add(satelliteToAdd);
    }

    public List<GenericSatellite> getSatelliteList() {
        return this.satellites;
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        c.addSatellite(new FastSatellite("Fast Satellite 1"));
        c.addSatellite(new FastSatellite("Fast Satellite 2"));
        c.addSatellite(new SlowSatellite("Slow Satellite 1"));

        List<GenericSatellite> allSatellites = c.getSatelliteList();

        //* What if I just want FastSatellites only?

        // Method 1, normal for-in/for-each
        List<GenericSatellite> fast1 = new ArrayList<>();
        for (GenericSatellite x : allSatellites) {
            if (x instanceof FastSatellite) {
                fast1.add(x);
            }
        }

        // Method 2, streams
        List<GenericSatellite> fast2 = allSatellites
            .stream()
            .filter(x -> x instanceof FastSatellite)
            .collect(Collectors.toList());

        // Same, but I typecast at the same time
        List<FastSatellite> fast3 = allSatellites
            .stream()
            .filter(x -> x instanceof FastSatellite)
            .map(x -> (FastSatellite) x)
            .collect(Collectors.toList());

        //* What if im trying to look for a satellite with name == "Fast Satellite 2"?

        // Method 1, normal for-in/for-each
        GenericSatellite g1 = null;
        for (GenericSatellite x : allSatellites) {
            if (x.getName().equals("Fast Satellite 2")) {
                g1 = x;
                break;
            }
        }

        // Method 2, streams
        Optional<GenericSatellite> g2 = allSatellites
            .stream()
            .filter(x -> x.getName().equals("Fast Satellite 2"))
            .findAny();
    }
}