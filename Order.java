import java.util.ArrayList;

// Here we're creating a new data type called Order
public class Order {

  // MEMBER VARIABLES
  private String name; // default value of null
  private boolean ready; // default value false
  private ArrayList<Item> items; // defaults to null

  public Order() {
    this.name = "Guest";
    this.items = new ArrayList<Item>();

  }
  // OVERLOADED CONSTRUCTOR

  public Order(String name) {
    this.name = name;
    this.items = new ArrayList<Item>();
  }

  // ORDER METHODS

  public void addItem(Item item) {
    this.items.add(item);
  }

  public String getStatusMessage() {
    if (this.ready) {
      return "Your order is ready.";
    } else {
      return "Keep Waiting.";
    }
  }

  public double getOrderTotal() {
    double total = 0;
    for (Item item : this.items) {
      total += item.getPrice();
    }
    return total;

  }

  public void display() {
    System.out.printf("Customer Name: %s%n", this.name);
    for (Item item : this.items) {
      System.out.printf("%s - $%s%n", item.getName(), item.getPrice());
    }

  }

  // GETTERS & SETTERS

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isReady() {
    return this.ready;
  }

  public boolean getReady() {
    return this.ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

}