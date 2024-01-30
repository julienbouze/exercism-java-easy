class SpaceAge {
    public double seconds;
    public static double dividor = 31557600;
    public static double mercury = 0.2408467;
    public static double venus = 0.61519726;
    public static double earth = 1.0;
    public static double mars = 1.8808158;
    public static double jupiter = 11.862615;
    public static double saturn = 29.447498;
    public static double uranus = 84.016846;
    public static double neptune = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / dividor*earth;
    }

    double onMercury() {
        return onEarth() / mercury ;
    }

    double onVenus() {
        return onEarth() / venus ;
    }

    double onMars() {
        return onEarth() / mars ;
    }

    double onJupiter() {
        return onEarth() / jupiter ;
    }

    double onSaturn() {
        return onEarth() / saturn ;
    }

    double onUranus() {
        return onEarth() / uranus ;
    }

    double onNeptune() {
        return onEarth() / neptune ;
    }

}
