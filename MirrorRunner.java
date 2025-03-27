class MirrorRunner{ 
 public static void main(String[] args){  
 Mirror mirror = new Mirror("50cm", "Oval", "Wood", "Anti-glare", "Silver", 50, 30, 5, 2000, 2, 2023, true, false, true, false, true, 2.5, 98.5, 85.0, 'A', 'B'); 
 Mirror mirror1 = new Mirror("40cm", "Round", "Metal", "UV-coated", "White", 40, 25, 4, 1500, 3, 2022, false, true, false, true, false, 1.8, 95.0, 80.0, 'B', 'C');  
 Mirror mirror2 = new Mirror("60cm", "Square", "Aluminum", "Silver-coated", "Black", 60, 35, 6, 2500, 5, 2024, true, true, true, true, true, 3.0, 99.0, 90.0, 'A', 'A'); 
 System.out.println("Mirror 1: " + mirror.length + ", " + mirror.shape + ", " + mirror.frameMaterial + ", " + mirror.coatingType + ", " + mirror.color);     
 System.out.println("Mirror 2: " + mirror1.length + ", " + mirror1.shape + ", " + mirror1.frameMaterial + ", " + mirror1.coatingType + ", " + mirror1.color);   
 System.out.println("Mirror 3: " + mirror2.length + ", " + mirror2.shape + ", " + mirror2.frameMaterial + ", " + mirror2.coatingType + ", " + mirror2.color);    
 }
 }