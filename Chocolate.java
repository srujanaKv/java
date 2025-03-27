class Chocolate {
    String brand, type, flavor, countryOfOrigin, packaging;
    int weight, price, cocoaPercentage, sugarContent, expiryYear;
    boolean isDark, containsNuts;
    double sweetnessLevel, bitternessLevel;
    char qualityGrade;
    long batchNumber;
    short shelfLife;
    byte textureRating;
    float meltingPoint;
    
    Chocolate(String brand, String type, String flavor, String countryOfOrigin, String packaging, int weight, int price, int cocoaPercentage, int sugarContent, int expiryYear, boolean isDark, boolean containsNuts, double sweetnessLevel, double bitternessLevel, char qualityGrade, long batchNumber, short shelfLife, byte textureRating, float meltingPoint) {
        this.brand = brand;
        this.type = type;
        this.flavor = flavor;
        this.countryOfOrigin = countryOfOrigin;
        this.packaging = packaging;
        this.weight = weight;
        this.price = price;
        this.cocoaPercentage = cocoaPercentage;
        this.sugarContent = sugarContent;
        this.expiryYear = expiryYear;
        this.isDark = isDark;
        this.containsNuts = containsNuts;
        this.sweetnessLevel = sweetnessLevel;
        this.bitternessLevel = bitternessLevel;
        this.qualityGrade = qualityGrade;
        this.batchNumber = batchNumber;
        this.shelfLife = shelfLife;
        this.textureRating = textureRating;
        this.meltingPoint = meltingPoint;
    }
    
    void display() {
        System.out.println("Chocolate: " + brand + ", " + type + ", " + flavor + ", " + countryOfOrigin + ", " + packaging + ", " + weight + ", " + price + ", " + cocoaPercentage + ", " + sugarContent + ", " + expiryYear + ", " + isDark + ", " + containsNuts + ", " + sweetnessLevel + ", " + bitternessLevel + ", " + qualityGrade + ", " + batchNumber + ", " + shelfLife + ", " + textureRating + ", " + meltingPoint);
    }
}
