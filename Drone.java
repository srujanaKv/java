class Drone {
    String brand, model, color, cameraQuality, batteryType;
    int maxFlightTime, maxSpeed, weight, range, chargingTime;
    boolean hasGPS, hasObstacleAvoidance;
    double price, altitudeLimit;
    char category;
    long serialNumber;
    short warrantyPeriod;
    byte numberOfPropellers;
    float windResistance;
    
    Drone(String brand, String model, String color, String cameraQuality, String batteryType, int maxFlightTime, int maxSpeed, int weight, int range, int chargingTime, boolean hasGPS, boolean hasObstacleAvoidance, double price, double altitudeLimit, char category, long serialNumber, short warrantyPeriod, byte numberOfPropellers, float windResistance) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cameraQuality = cameraQuality;
        this.batteryType = batteryType;
        this.maxFlightTime = maxFlightTime;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.range = range;
        this.chargingTime = chargingTime;
        this.hasGPS = hasGPS;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.price = price;
        this.altitudeLimit = altitudeLimit;
        this.category = category;
        this.serialNumber = serialNumber;
        this.warrantyPeriod = warrantyPeriod;
        this.numberOfPropellers = numberOfPropellers;
        this.windResistance = windResistance;
    }
    
    void display() {
        System.out.println("Drone: " + brand + ", " + model + ", " + color + ", " + cameraQuality + ", " + batteryType + ", " + maxFlightTime + ", " + maxSpeed + ", " + weight + ", " + range + ", " + chargingTime + ", " + hasGPS + ", " + hasObstacleAvoidance + ", " + price + ", " + altitudeLimit + ", " + category + ", " + serialNumber + ", " + warrantyPeriod + ", " + numberOfPropellers + ", " + windResistance);
    }
}
