class WineRunner {
    public static void main(String[] args) {
        String name = "Cabernet Sauvignon";
        double price = 1200.0;
        String type = "Red";
        int age = 5;
        double alcoholContent = 13.5;
        String origin = "France";
        boolean isSparkling = false;
        double volume = 750.0;
        String bottleMaterial = "Glass";
        String flavor = "Rose";

        Wine wine = new Wine();
        Wine wine1 = new Wine(name);
        Wine wine2 = new Wine(name, price);
        Wine wine3 = new Wine(name, price, type);
        Wine wine4 = new Wine(name, price, type, age);
        Wine wine5 = new Wine(name, price, type, age, alcoholContent);
        Wine wine6 = new Wine(name, price, type, age, alcoholContent, origin);
        Wine wine7 = new Wine(name, price, type, age, alcoholContent, origin, isSparkling);
        Wine wine8 = new Wine(name, price, type, age, alcoholContent, origin, isSparkling, volume);
        Wine wine9 = new Wine(name, price, type, age, alcoholContent, origin, isSparkling, volume, bottleMaterial);
        Wine wine10 = new Wine(name, price, type, age, alcoholContent, origin, isSparkling, volume, bottleMaterial, flavor);

        wine.info();
        wine1.info();
        wine2.info();
        wine3.info();
        wine4.info();
        wine5.info();
        wine6.info();
        wine7.info();
        wine8.info();
        wine9.info();
        wine10.info();
    }
}