public class TabRunner {
    public static void main(String[] args) {
        Tab t1 = new Tab("Apple", "iPad Pro", "Silver", "iOS", "M2", 256, 8, 10000, 12, 12, true, true, 999.99, 1.2, 'A', 8001L, (short)24, (byte)1, 120.0f);
        Tab t2 = new Tab("Samsung", "Galaxy Tab S8", "Black", "Android", "Snapdragon 8 Gen 1", 128, 6, 8000, 11, 13, true, false, 799.99, 1.1, 'B', 8002L, (short)12, (byte)1, 90.0f);
        Tab t3 = new Tab("Microsoft", "Surface Pro 9", "Platinum", "Windows", "Intel i7", 512, 16, 12000, 13, 10, true, true, 1299.99, 1.3, 'A', 8003L, (short)36, (byte)2, 60.0f);
        
        t1.display();
        t2.display();
        t3.display();
    }
}
