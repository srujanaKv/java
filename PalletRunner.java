class PalletRunner{
public static void main(String[] args){

String material="wood";
double weight=20.0;
int length=5;
int width=7;
int height=6;
String name="wooden";
String location="warehouse";
String loadstatus="loaded";
String handlingstatus="keepDry";
boolean stackable=true;
Pallet pallet=new Pallet();
Pallet pallet1=new Pallet(material);
Pallet pallet2=new Pallet(material,weight);
Pallet pallet3=new Pallet(material,weight,length);
Pallet pallet4=new Pallet(material,weight,length,width);
Pallet pallet5=new Pallet(material,weight,length,width,height);
Pallet pallet6=new Pallet(material,weight,length,width,height,name);
Pallet pallet7=new Pallet(material,weight,length,width,height,name,location);
Pallet pallet8=new Pallet(material,weight,length,width,height,name,location,loadstatus);
Pallet pallet9=new Pallet(material,weight,length,width,height,name,location,loadstatus,handlingstatus);
Pallet pallet10=new Pallet(material,weight,length,width,height,name,location,loadstatus,handlingstatus,stackable);

pallet.info();
pallet1.info();
pallet2.info();
pallet3.info();
pallet4.info();
pallet5.info();
pallet6.info();
pallet7.info();
pallet8.info();
pallet9.info();
pallet10.info();
}
}