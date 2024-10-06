public class Refresher extends Starbucks {

  // Instance Variables
 private String type;
private boolean hasLemonade;
private String size;


  // Constructor Methods
  // No-Arguement
public Refresher(){
  hasLemonade = true;
  size = "Venti";
}


  // Parameterized
public Refresher(String type, boolean isBlended, double price, boolean hasLemonade, String size){
  super (type, isBlended, price);
  this.hasLemonade = hasLemonade;
  this.size = size;
}


  // Accessor and Mutator
public boolean getHasLemoade (){
  return hasLemonade;
}

public String getSizeStatus (){
  return size;
}

  
// toString method
public String toString(){
  return super.toString() + "\nHas Lemonade: " + hasLemonade + "\nSize: " + size;
}


  
}