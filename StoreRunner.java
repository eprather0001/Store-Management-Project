import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

Starbucks drink1 = new Starbucks();

    Starbucks drink2 = new Starbucks("Refresher", false, 4.25);

System.out.println(drink2);
System.out.println();

    // Closes the Scanner object
    input.close();
    
  }
}