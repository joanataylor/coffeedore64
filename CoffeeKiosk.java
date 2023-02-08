import java.util.ArrayList;

public class CoffeeKiosk {
  private ArrayList<Item> menu;
  private ArrayList<Order> orders;

  public CoffeeKiosk() {
    this.menu = new ArrayList<Item>();
    this.orders = new ArrayList<Order>();

  }

  public void addMenuItem(String name, double price) {
    Item item = new Item(name, price);
    this.menu.add(item);
  }

  public void displayMenu() {
    for (Item item : this.menu) {
      System.out.printf("%s %s -- $%s%n", menu.indexOf(item), item.getName(), item.getPrice());
    }
  }

  public void newOrder() {

    // Shows the user a message prompt and then sets their input to a variable, name
    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    // Your code:
    // Create a new order with the given input string
    Order order = new Order(name);
    // Show the user the menu, so they can choose items to add.
    displayMenu();

    // Prompts the user to enter an item number
    System.out.println("Please enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();
    displayMenu();

    // Write a while loop to collect all user's order items
    while (!itemNumber.equals("q")) {

      // int i = Integer.parseInt(itemNumber);
      // if(i < this.menu.size()){
      //     Item orderItem = menu.get(i);
      //     order.addItem(orderItem);
      // } else {
      //     System.out.println("Sorry we d not have it");
      // }
      // Get the item object from the menu, and add the item to the order
      try {
        order.addItem(menu.get(Integer.parseInt(itemNumber)));
      } catch (IndexOutOfBoundsException i) {
        System.out.println("Invalid selection");
      } catch (NumberFormatException n) {
        System.out.println("Invalid selection");
      }

      // Ask them to enter a new item index or q again, and take their input
      System.out.println("Please enter a menu item index or q to quit:");
      itemNumber = System.console().readLine();
    }

    // After you have collected their order, print the order details
    // as the example below. You may use the order's display method.
    order.display();
    this.orders.add(order);

  }

}