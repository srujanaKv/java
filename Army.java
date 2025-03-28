class Army{

    String country;          
    int numberOfSoldiers;    
    int tanks;               
    int aircraft;            
    int warships;            
    String commander;        
    String baseLocation;     
    String specialForcesUnit; 
    boolean nuclearCapability; 
    int budget;              
    String missionStatus;
	
	public Army(){
	
	}
	
	public Army(String country){
	this.country=country;
	
	}
	public Army(String country,int numberOfSoldiers){
	this(country);
	this.numberOfSoldiers=numberOfSoldiers;
	
	}
	public Army(String country,int numberOfSoldiers,int tanks){
	this(country,numberOfSoldiers);
	this.tanks=tanks;
	
}
public Army(String country,int numberOfSoldiers,int tanks,int aircraft){
	this(country,numberOfSoldiers,tanks);
	this.aircraft=aircraft;
}
public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships){
	this(country,numberOfSoldiers,tanks,aircraft);
	this.warships=warships;
	}
	public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships,String commander){
	this(country,numberOfSoldiers,tanks,aircraft,warships);
	this.commander=commander;
	}
	public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships,String commander,String baseLocation){
	this(country,numberOfSoldiers,tanks,aircraft,warships,aircraft,commander);
	this.baseLocation=baseLocation;
	}
	public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships,String commander,String baseLocation,String specialForcesUnit){
	this(country,numberOfSoldiers,tanks,aircraft,warships,aircraft,commander,baseLocation);
	this.specialForcesUnit=specialForcesUnit;
	}
	public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships,String commander,String baseLocation,String specialForcesUnit,String nuclearCapability){
	this(country,numberOfSoldiers,tanks,aircraft,warships,aircraft,commander,baseLocation,specialForcesUnit);
	this.nuclearCapability;
	}
	public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships,String commander,String baseLocation,String specialForcesUnit,String nuclearCapability,int budget){
	this(country,numberOfSoldiers,tanks,aircraft,warships,aircraft,commander,baseLocation,specialForcesUnit,nuclearCapability);
	this.budget=budget;
	}
	public Army(String country,int numberOfSoldiers,int tanks,int aircraft,int warships,String commander,String baseLocation,String specialForcesUnit,String nuclearCapability,int budget,String missionStatus){
	this(country,numberOfSoldiers,tanks,aircraft,warships,aircraft,commander,baseLocation,specialForcesUnit,nuclearCapability,budget);
	this.missionStatus;
	}
	public void info(){
	
	System.out.println("Running Army info");
	System.out.println("army country:"+this.country);
	System.out.println("army numberOfSoldiers:"+this.numberOfSoldiers);
	System.out.println("army tanks:"+this.tanks);
	System.out.println("army aircraft:"+this.aircraft);
	System.out.println("army warships:"+this.warships);
	System.out.println("army commander:"+this.commander);
	System.out.println("army baseLocation:"+this.baseLocation);
	System.out.println("army specialForcesUnit:"+this.specialForcesUnit);
	System.out.println("army nuclearCapability:"+this.nuclearCapability);
	System.out.println("army budget:"+this.budget);
	System.out.println("army missionStatus:"+this.missionStatus);

}
	}
	