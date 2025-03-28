class Wine {
    String name;
    double price;
    String type;
    int age;
    double alcoholContent;
    String origin;
    boolean isSparkling;
    double volume;
    String bottleMaterial;
    String flavor;

    public Wine() {
    }

    public Wine(String name) {
        this.name = name;
    }

    public Wine(String name, double price) {
        this(name);
        this.price = price;
    }

    public Wine(String name, double price, String type) {
        this(name, price);
        this.type = type;
    }

    public Wine(String name, double price, String type, int age) {
        this(name, price, type);
        this.age = age;
    }

    public Wine(String name, double price, String type, int age, double alcoholContent) {
        this(name, price, type, age);
        this.alcoholContent = alcoholContent;
    }

    public Wine(String name, double price, String type, int age, double alcoholContent, String origin) {
        this(name, price, type, age, alcoholContent);
        this.origin = origin;
    }

    public Wine(String name, double price, String type, int age, double alcoholContent, String origin, boolean isSparkling) {
        this(name, price, type, age, alcoholContent, origin);
        this.isSparkling = isSparkling;
    }

    public Wine(String name, double price, String type, int age, double alcoholContent, String origin, boolean isSparkling, double volume) {
        this(name, price, type, age, alcoholContent, origin, isSparkling);
        this.volume = volume;
    }

    public Wine(String name, double price, String type, int age, double alcoholContent, String origin, boolean isSparkling, double volume, String bottleMaterial) {
        this(name, price, type, age, alcoholContent, origin, isSparkling, volume);
        this.bottleMaterial = bottleMaterial;
    }

    public Wine(String name, double price, String type, int age, double alcoholContent, String origin, boolean isSparkling, double volume, String bottleMaterial, String flavor) {
        this(name, price, type, age, alcoholContent, origin, isSparkling, volume, bottleMaterial);
        this.flavor = flavor;
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
        System.out.println("Age: " + this.age);
        System.out.println("Alcohol Content: " + this.alcoholContent);
        System.out.println("Origin: " + this.origin);
        System.out.println("Sparkling: " + this.isSparkling);
        System.out.println("Volume: " + this.volume);
        System.out.println("Bottle Material: " + this.bottleMaterial);
        System.out.println("Flavor: " + this.flavor);
    }
}


