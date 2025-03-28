class Rocket {
    long price;
    String brand;
    String model;
    int weight;
    double maxSpeed;
    int maxAltitude;
    int fuelCapacity;
    boolean hasReusableStages;
    int numberOfEngines;
    boolean hasAutonomousLanding;
    String countryOfOrigin;
    int warrantyPeriod;
    boolean hasEscapeSystem;
    String launchDate;
    int payloadCapacity;
    boolean hasAIControl;
    int thrust;
    boolean hasCrewSupport;
    boolean supportsSatelliteDeployment;
    String fuelType; 
    public Rocket(long price, String brand, String model, int weight, double maxSpeed, int maxAltitude, int fuelCapacity, 
                  boolean hasReusableStages, int numberOfEngines, boolean hasAutonomousLanding, String countryOfOrigin, 
                  int warrantyPeriod, boolean hasEscapeSystem, String launchDate, int payloadCapacity, boolean hasAIControl, 
                  int thrust, boolean hasCrewSupport, boolean supportsSatelliteDeployment, String fuelType) {
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
        this.fuelCapacity = fuelCapacity;
        this.hasReusableStages = hasReusableStages;
        this.numberOfEngines = numberOfEngines;
        this.hasAutonomousLanding = hasAutonomousLanding;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyPeriod = warrantyPeriod;
        this.hasEscapeSystem = hasEscapeSystem;
        this.launchDate = launchDate;
        this.payloadCapacity = payloadCapacity;
        this.hasAIControl = hasAIControl;
        this.thrust = thrust;
        this.hasCrewSupport = hasCrewSupport;
        this.supportsSatelliteDeployment = supportsSatelliteDeployment;
        this.fuelType = fuelType;
   
   }
    public void displayDetails() {
        System.out.println("Rocket Details:");
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Max Altitude: " + maxAltitude + " km");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Has Reusable Stages: " + hasReusableStages);
        System.out.println("Number of Engines: " + numberOfEngines);
        System.out.println("Has Autonomous Landing: " + hasAutonomousLanding);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
        System.out.println("Has Escape System: " + hasEscapeSystem);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
        System.out.println("Has AI Control: " + hasAIControl);
        System.out.println("Thrust: " + thrust + " kN");
        System.out.println("Has Crew Support: " + hasCrewSupport);
        System.out.println("Supports Satellite Deployment: " + supportsSatelliteDeployment);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println();
    }
}
