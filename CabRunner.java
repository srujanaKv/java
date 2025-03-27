public class CabRunner {
    public static void main(String[] args) {
        Cab c1 = new Cab("Uber", "Toyota Camry", "White", "Petrol", "Automatic", 4, 180, 150, 15, 2020, true, false, 12.5, 50.0, 'A', 2001L, (short)3, (byte)5, 8.5f);
        Cab c2 = new Cab("Lyft", "Honda Accord", "Black", "Hybrid", "Automatic", 4, 170, 140, 12, 2019, true, false, 14.0, 45.0, 'B', 2002L, (short)4, (byte)4, 8.0f);
        Cab c3 = new Cab("Ola", "Hyundai Verna", "Silver", "Diesel", "Manual", 4, 160, 130, 10, 2018, true, false, 16.0, 55.0, 'B', 2003L, (short)5, (byte)3, 7.5f);
        
        c1.display();
        c2.display();
        c3.display();
    }
}
