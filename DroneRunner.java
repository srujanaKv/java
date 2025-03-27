public class DroneRunner {
    public static void main(String[] args) {
        Drone d1 = new Drone("DJI", "Mavic Air ", "Gray", "4", "Li-Po", 34, 68, 570, 10000, 90, true, true, 799.99, 5000, 'A', 7001L, 24, 4, 35.0f);
        Drone d2 = new Drone("Parrot", "Anafi", "Black", "4K HDR", "Li-Ion", 25, 55, 320, 4000, 60, true, false, 699.99, 4500, 'B', 7002L, 12, 4, 30.5f);
        Drone d3 = new Drone("Autel", "Evo II", "Orange", "8K", "Li-Po", 40, 72, 1150, 9000, 100, true, true, 1499.99, 6000, 'A', 7003L, 36, 6, 40.0f);
        
        d1.display();
        d2.display();
        d3.display();
    }
}
