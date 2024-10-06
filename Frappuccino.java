public class Frappuccino extends Starbucks {
  
// Instance Variables
private boolean hasCoffee;
private String size;


  // Constructor Methods
  // No-arguement 
public Frappuccino(){
   hasCoffee = true;
  size = "Grande";
}

  // Parameterized
public Frappuccino(String type, boolean isBlended, double price, boolean hasCoffee, String size){
  super (type, isBlended, price);
  this.hasCoffee = hasCoffee;
  this.size = size;
}

  // Accessor and Mutator
public boolean getCoffee (){
  return hasCoffee;
}

public String getSize (){
  return size;
}

  // toString
public String toString() {
  return super.toString() + "\nHas Coffee: " + hasCoffee + "\nSize: " + size;
}
  




  





}