public class PlanetsRunner {
    public static void main(String[] args) {
        Planet p1 = new Planet("Earth", "Terrestrial", "Milky Way", "Nitrogen-Oxygen", "Iron", 5.972E24, 6371, 9.8, 365.25, 149.6E6, 1, 4500000000L, false, true, 'A', 1001L, (short)23, (byte)5, 15.0f);
        Planet p2 = new Planet("Mars", "Terrestrial", "Milky Way", "Carbon Dioxide", "Silicon", 6.39E23, 3389, 3.7, 687, 227.9E6, 2, 4600000000L, false, false, 'B', 1002L, (short)25, (byte)3, -63.0f);
        Planet p3 = new Planet("Jupiter", "Gas Giant", "Milky Way", "Hydrogen-Helium", "Hydrogen", 1.898E27, 69911, 24.8, 4333, 778.5E6, 79, 4600000000L, true, false, 'C', 1003L, (short)3, (byte)10, -145.0f);
        
        p1.display();
        p2.display();
        p3.display();
    }
}