class Pallet{

String material;
double weight;
int length;
int width;
int height;
String name;
String location;
String loadstatus;
String handlingstatus;
boolean stackable;

public Pallet(){


}

public Pallet(String material){
this.material=material;

}
public Pallet(String material,double weight){
this(material);
this.weight=weight;
}
public Pallet(String material,double weight,int length){
this(material,weight);
this.length=length;

}
public Pallet(String material,double weight,int length,int width){
this(material,weight,length);
this.width=width;
}
public Pallet(String material,double weight,int length,int width,int height){
this(material,weight,length,width);
this.height=height;
}
public Pallet(String material,double weight,int length,int width,int height,String name){
this(material,weight,length,width,height);
this.name=name;
}
public Pallet(String material,double weight,int length,int width,int height,String name,String location){
this(material,weight,length,width,height,name);
this.location=location;
}
public Pallet(String material,double weight,int length,int width,int height,String name,String location,String loadstatus){
this(material,weight,length,width,height,name,location);
this.loadstatus=loadstatus;
}

public Pallet(String material,double weight,int length,int width,int height,String name,String location,String loadstatus,String handlingstatus){
this(material,weight,length,width,height,name,location,loadstatus);
this.handlingstatus=handlingstatus;
}
public Pallet(String material,double weight,int length,int width,int height,String name,String location,String loadstatus,String handlingstatus,boolean stackable){
this(material,weight,length,width,height,name,location,loadstatus,handlingstatus);
this.stackable=stackable;
}

public void info(){
System.out.println("Running pallet info");
System.out.println("pallet material:"+this.material);
System.out.println("pallet weight:"+this.weight);
System.out.println("pallet length:"+this.length);
System.out.println("pallet width:"+this.width);
System.out.println("pallet height:"+this.height);
System.out.println("pallet name:"+this.name);
System.out.println("pallet location:"+this.location);
System.out.println("pallet loadstatus:"+this.loadstatus);
System.out.println("pallet handlingstatus:"+this.handlingstatus);
System.out.println("pallet stackable:"+this.stackable);

}
}









