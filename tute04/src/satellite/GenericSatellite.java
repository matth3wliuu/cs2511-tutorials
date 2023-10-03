package satellite;

public abstract class GenericSatellite {
    private double speed;
    private String name;

    public GenericSatellite(double speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getSpeed() {
        return this.speed;
    }
}
