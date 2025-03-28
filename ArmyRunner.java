class ArmyRunner{
public static void main(string []args){

String country="India";
int numberOfSoldiers=2500;
int tanks=100;               
int aircraft=500;            
int warships=150;            
String commander="unnikrishnan";        
String baseLocation="kashmir";     
String specialForcesUnit="navyseals"; 
boolean nuclearCapability=true; 
int budget=80000;              
String missionStatus="defensive";


Army army1=new Army();
Army army2=new Army(country);
Army army3=new Army(country,numberOfSoldiers);
Army army4=new Army(country,numberOfSoldiers,tanks);
Army army5=new Army(country,numberOfSoldiers,tanks,aircraft);
Army army6=new Army(country,numberOfSoldiers,tanks,aircraft,warships);
Army army7=new Army(country,numberOfSoldiers,tanks,aircraft,warships,commander);
Army army7=new Army(country,numberOfSoldiers,tanks,aircraft,warships,commander,baseLocation);
Army army7=new Army(country,numberOfSoldiers,tanks,aircraft,warships,commander,baseLocation,specialForcesUnit);
Army army7=new Army(country,numberOfSoldiers,tanks,aircraft,warships,commander,baseLocation,specialForcesUnit,nuclearCapability);
Army army7=new Army(country,numberOfSoldiers,tanks,aircraft,warships,commander,baseLocation,specialForcesUnit,nuclearCapability,budget);
Army army7=new Army(country,numberOfSoldiers,tanks,aircraft,warships,commander,baseLocation,specialForcesUnit,nuclearCapability,budget,missionStatus);


army1.info();
army2.info();
army3.info();
army4.info();
army5.info();
army6.info();
army7.info();
army8.info();
army9.info();
army10.info();

}
}




