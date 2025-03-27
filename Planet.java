class Planet {
    String name, type, galaxy, atmosphereComposition, dominantElement;
    double mass, radius, gravity, orbitalPeriod, distanceFromSun;
    int numberOfMoons, age;
    boolean hasRings, supportsLife;
    char classification;
    long planetId;
    short axialTilt;
    byte magneticFieldStrength;
    float averageTemperature;
    
    Planet(String name, String type, String galaxy, String atmosphereComposition, String dominantElement, double mass, double radius, double gravity, double orbitalPeriod, double distanceFromSun, int numberOfMoons, int age, boolean hasRings, boolean supportsLife, char classification, long planetId, short axialTilt, byte magneticFieldStrength, float averageTemperature) {
        this.name = name;
        this.type = type;
        this.galaxy = galaxy;
        this.atmosphereComposition = atmosphereComposition;
        this.dominantElement = dominantElement;
        this.mass = mass;
        this.radius = radius;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
        this.age = age;
        this.hasRings = hasRings;
        this.supportsLife = supportsLife;
        this.classification = classification;
        this.planetId = planetId;
        this.axialTilt = axialTilt;
        this.magneticFieldStrength = magneticFieldStrength;
        this.averageTemperature = averageTemperature;
    }
    
    void display() {
        System.out.println("Planet: " + name + ", " + type + ", " + galaxy + ", " + atmosphereComposition + ", " + dominantElement + ", " + mass + ", " + radius + ", " + gravity + ", " + orbitalPeriod + ", " + distanceFromSun + ", " + numberOfMoons + ", " + age + ", " + hasRings + ", " + supportsLife + ", " + classification + ", " + planetId + ", " + axialTilt + ", " + magneticFieldStrength + ", " + averageTemperature);
    }
}
