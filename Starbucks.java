public class Starbucks {
// Instance Variables

private String type;
private boolean isBlended;
private double price;


  // Constructor Methods
// No-Arguement 
public Starbucks() {
type = "Type";  
isBlended = false;
  price = 4.25;
}
//Parameterize
  public Starbucks(String type, boolean isBlended, double price) {
  this.type = type;
    this.isBlended = isBlended;
    this.price = price;
}

  // Acessor and Mutator Methods

public String getType() {
  return type;
}


  public void setType(String type ){
    this.type = type;
  }

  public boolean getIsBlended() {
    return isBlended;
  }

  public void setIsBlended (boolean isBlended){
    this.isBlended = isBlended;
  }

public double getPrice() {
  return price;
}

public void setPrice(double price) {
  this.price = price;
}

  
  // toString Method Override

public String toString () {
  String text = " ";
  if(isBlended){
    text += "Yes";
  } else {
    text += " No  ";
  }
  return  "Drink type: " +   type +  "\nIs Blended: " +  text  +  "\nPrice: " + price;
}


  
  // Other Methods




  
}