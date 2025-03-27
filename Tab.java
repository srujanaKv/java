class Tab{

String shape,length,color,material,cover;
int cost,weight,height,width,thickness;
 boolean isFramed, isAntifog, isScratchResistant, isShatterproof, isWaterproof;    
  double cameraQuality, transparencyLevel;  
  char durabilityGrade,qualityGrade;    
  public Tab(String length,String color,String shape,String material,String cover,int cost,int weight,int height,
  int width,int tnickness,boolean isFramed,boolean isAntifog,boolean isScratchResistant,boolean isShatterproof,boolean isWaterproof,
  double weight, double reflectionQuality, double transparencyLevel,               
  char qualityGrade, char durabilityGrade) 
  System.out.println("explicitly define the tab");
  this.shape=shape;
  this.length=length;
  this.color=color;
  this.material=material;
  this.cover=cover;
  this.cost=cost;
  this.weight=weight;
  this.height=height;
  this.width=width;
  this.thickness=thickness;
  this.isFramed=isFramed;
  this.isAntifog=isAntifog;
  this.isScratchResistant=isScratchResistant;
  this.isShatterproof=isShatterproof;
  this.isWaterproof=isWaterproof;
  this.cameraQuality=reflectionQuality;
  this.transparencyLevel=transparencyLevel;
  this.durabilityGrade=durabilityGrade; 
  this.qualityGrade=qualityGrade;
  
}
}  