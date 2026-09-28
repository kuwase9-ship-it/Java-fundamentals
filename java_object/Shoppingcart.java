import java.util.Scanner;

public class Shoppingcart {
    private int totalItems;
    private double totalPrice;

    public void addItem(double price) {
        totalItems++;
        totalPrice += price;
       
    }

    public void removeItem(double price) {
        if (totalItems > 0) {
            totalItems--;
            totalPrice -= price;
           
        } else {
            System.out.println(" ! Cart is already empty. Cannot remove items!");
        }
    }

    
    public void emptyCart() {
        totalItems = 0;
        totalPrice = 0.0;
        System.out.println(" Cart has been emptied. ");
    }

    
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shoppingcart cart = new Shoppingcart();

        System.out.println("=== E-Commerce Shopping Cart ===");

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Empty Cart");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = input.next();
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();
                    System.out.print("Enter price per item: ");
                    double price = input.nextDouble();

                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = input.next();
                    System.out.print("Enter quantity to remove: ");
                    int removeQty = input.nextInt();
                    System.out.print("Enter price per item: ");
                    double removePrice = input.nextDouble();

                    
                    break;

                case 3:
                    cart.emptyCart();
                    break;

                
                case 4:
                    running = false;
                    System.out.println("Exiting... Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}


