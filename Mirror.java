class Mirror {   
  String length, shape, frameMaterial, coatingType, color;    
  int height, width, thickness, price, warrantyYears, productionYear;     
  boolean isFramed, isAntifog, isScratchResistant, isShatterproof, isWaterproof;    
  double weight, reflectionQuality, transparencyLevel;   
  char qualityGrade, durabilityGrade;    
  public Mirror(String length, String shape, String frameMaterial, String coatingType, String color,           
  int height, int width, int thickness, int price, int warrantyYears, int productionYear,         
  boolean isFramed, boolean isAntifog, boolean isScratchResistant, boolean isShatterproof, boolean isWaterproof,         
  double weight, double reflectionQuality, double transparencyLevel,               
  char qualityGrade, char durabilityGrade) { 					
  System.out.println("Explictly define the Mirror:");      
  this.length = length;    
  this.shape = shape;      
  this.frameMaterial = frameMaterial;   
  this.coatingType = coatingType;    
  this.color = color;    
  this.height = height;    
  this.width = width;    
  this.thickness = thickness;  
  this.price = price;    
  this.warrantyYears = warrantyYears;  
  this.productionYear = productionYear;   
  this.isFramed = isFramed;     
  this.isAntifog = isAntifog;   
  this.isScratchResistant = isScratchResistant;   
  this.isShatterproof = isShatterproof;    
  this.isWaterproof = isWaterproof;    
  this.weight = weight;   
  this.reflectionQuality = reflectionQuality;   
  this.transparencyLevel = transparencyLevel;    
  this.qualityGrade = qualityGrade;      
  this.durabilityGrade = durabilityGrade;   
  } 
}


