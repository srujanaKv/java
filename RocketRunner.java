RocketRunner.java
class RocketRunner {
    public static void main(String[] args) {
        // Creating Rocket objects
        Rocket rocket1 = new Rocket(500000000, "SpaceX", "Falcon 9", 549054, 27000.0, 200000, 400000, 
                                    true, 9, true, "USA", 10, true, "30 March 2017", 22800, 
                                    true, 7607, true, true, "RP-1");
        
        Rocket rocket2 = new Rocket(900000000, "NASA", "SLS", 2600000, 40000.0, 450000, 2900000, 
                                    false, 4, false, "USA", 15, true, "16 Nov 2022", 95000, 
                                    true, 39000, true, true, "LH2");
        
        Rocket rocket3 = new Rocket(350000000, "Blue Origin", "New Glenn", 1300000, 31000.0, 400000, 1500000, 
                                    true, 7, true, "USA", 12, false, "2024", 45000, 
                                    true, 17000, false, true, "Methane");

        // Display details for each rocket
        rocket1.displayDetails();
        rocket2.displayDetails();
        rocket3.displayDetails();
    }
}