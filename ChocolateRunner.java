public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate c1 = new Chocolate("Cadbury", "Milk Chocolate", "Hazelnut", "UK", "Foil Wrap", 100, 150, 40, 30, 2025, false, true, 8.5, 2.0, 'A', 5001L,12, 5, 33.5f);
        Chocolate c2 = new Chocolate("Lindt", "Dark Chocolate", "Bitter", "Switzerland", "Box", 150, 300, 85, 10, 2026, true, false, 4.5, 8.0, 'A', 5002L, 24, 4, 32.0f);
        Chocolate c3 = new Chocolate("Hershey's", "White Chocolate", "Vanilla", "USA", "Plastic Wrap", 120, 200, 0, 50, 2024, false, false, 9.0, 1.5, 'B', 5003L,18,5, 34.0f);
        
        c1.display();
        c2.display();
        c3.display();
    }
}
