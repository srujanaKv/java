class Cab {
    String company, model, color, fuelType, transmission;
    int seatingCapacity, maxSpeed, enginePower, farePerKm, yearOfManufacture;
    boolean isACAvailable, isLuxury;
    double mileage, fuelCapacity;
    char rating;
    long cabId;
    short serviceYears;
    byte safetyFeatures;
    float comfortLevel;
    
    Cab(String company, String model, String color, String fuelType, String transmission, int seatingCapacity, int maxSpeed, int enginePower, int farePerKm, int yearOfManufacture, boolean isACAvailable, boolean isLuxury, double mileage, double fuelCapacity, char rating, long cabId, short serviceYears, byte safetyFeatures, float comfortLevel) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.seatingCapacity = seatingCapacity;
        this.maxSpeed = maxSpeed;
        this.enginePower = enginePower;
        this.farePerKm = farePerKm;
        this.yearOfManufacture = yearOfManufacture;
        this.isACAvailable = isACAvailable;
        this.isLuxury = isLuxury;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.rating = rating;
        this.cabId = cabId;
        this.serviceYears = serviceYears;
        this.safetyFeatures = safetyFeatures;
        this.comfortLevel = comfortLevel;
    }
    
    void display() {
        System.out.println("Cab: " + company + ", " + model + ", " + color + ", " + fuelType + ", " + transmission + ", " + seatingCapacity + ", " + maxSpeed + ", " + enginePower + ", " + farePerKm + ", " + yearOfManufacture + ", " + isACAvailable + ", " + isLuxury + ", " + mileage + ", " + fuelCapacity + ", " + rating + ", " + cabId + ", " + serviceYears + ", " + safetyFeatures + ", " + comfortLevel);
    }
}
