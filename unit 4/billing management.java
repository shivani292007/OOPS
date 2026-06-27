import java.util.*;
class Inventory {
 HashMap<String, Integer> stock = new HashMap<>();
 void addProduct(String name, int quantity) {
 stock.put(name, quantity);
 System.out.println(name + " added with quantity " + quantity);
 }
 void updateStock(String name, int quantity) {
 if (stock.containsKey(name)) {
 stock.put(name, stock.get(name) + quantity);
 System.out.println("Quantity updated for " + name);
 } else {
 System.out.println("Product not found in inventory");
 }
 }
 void displayStock() {
 System.out.println("\nInventory Details:");
 for (String key : stock.keySet()) {
 System.out.println("Product: " + key + " | Quantity: " + stock.get(key));
 }
 }
}
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory i = new Inventory();

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter initial quantity: ");
        int qty = sc.nextInt();

        i.addProduct(product, qty);

        System.out.print("Enter quantity to add: ");
        int update = sc.nextInt();

        i.updateStock(product, update);

        i.displayStock();
    }
}
