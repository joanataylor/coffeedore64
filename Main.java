public class Main {
  public static void main(String[] args) {
    CoffeeKiosk kiosk = new CoffeeKiosk();
    kiosk.newOrder();
    kiosk.displayMenu();
    kiosk.addMenuItem("Sushi", 75);
    kiosk.addMenuItem("Wine", 100);
    kiosk.addMenuItem("Ramen", 30);
    kiosk.addMenuItem("Soup", 18);
    kiosk.displayMenu();
  }

}