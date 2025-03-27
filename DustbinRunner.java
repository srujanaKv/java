public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin d1 = new Dustbin("Plastic", "CleanMax", "Blue", "Round", "Recycling", 50, 60, 40, 800, 5, true, true, 85.5, 4.5, 'A', 1234567890L, 2, 5, 0.9f);
        Dustbin d2 = new Dustbin("Metal", "EcoBin", "Green", "Square", "Compost", 70, 75, 50, 1200, 8, true, true, 90.0, 5.0, 'A', 987654321L, 3, 5, 0.95f);
        Dustbin d3 = new Dustbin("Plastic", "BioBin", "Black", "Rectangular", "General", 30, 50, 35, 500, 4, true, false, 80.0, 3.5, 'B', 456789123L, 1, 4, 0.85f);
        
        d1.display();
        d2.display();
        d3.display();
    }
}