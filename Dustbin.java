class Dustbin {
    String material, brand, color, shape, type;
    int capacity, height, width, price, weight;
    boolean hasLid, isRecyclable;
    double durability, odorControl;
    char qualityGrade;
    long serialNumber;
    short warranty;
    byte rating;
    float ecoFriendliness;
    
    Dustbin(String material, String brand, String color, String shape, String type, int capacity, int height, int width, int price, int weight, boolean hasLid, boolean isRecyclable, double durability, double odorControl, char qualityGrade, long serialNumber, short warranty, byte rating, float ecoFriendliness) {
        this.material = material;
        this.brand = brand;
        this.color = color;
        this.shape = shape;
        this.type = type;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.price = price;
        this.weight = weight;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.durability = durability;
        this.odorControl = odorControl;
        this.qualityGrade = qualityGrade;
        this.serialNumber = serialNumber;
        this.warranty = warranty;
        this.rating = rating;
        this.ecoFriendliness = ecoFriendliness;
    }
    
    void display() {
        System.out.println("Dustbin: " + material + ", " + brand + ", " + color + ", " + shape + ", " + type + ", " + capacity + ", " + height + ", " + width + ", " + price + ", " + weight + ", " + hasLid + ", " + isRecyclable + ", " + durability + ", " + odorControl + ", " + qualityGrade + ", " + serialNumber + ", " + warranty + ", " + rating + ", " + ecoFriendliness);
    }
}
