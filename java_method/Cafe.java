package src.java_method;
public class Cafe {

    public static void main(String[] args) {
        String customerName = "Alex";
        double coffeePrice = 4.50;
        int quantity = 200;
        boolean hasLoyaltyCard = true;
        double taxRate = 0.08;

        double baseTotal = coffeePrice * quantity;
        double discountedTotal = baseTotal;
        double discount = 0;

        if (hasLoyaltyCard) {
            discount = 2.50;
            discountedTotal -= discount;
        } else if (baseTotal > 15.00) {
            discount = baseTotal * 0.10;
            discountedTotal -= discount;
        }

        double finalTotal = calculateTax(discountedTotal, taxRate);
        double taxAmount = finalTotal - discountedTotal;


        System.out.println("\nBrewing in 3...");
        System.out.println("Brewing in 2...");
        System.out.println("Brewing in 1...");
        System.out.println("Coffee is ready!");


        System.out.println("===== CafePOS =====");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Coffee Price: $" + coffeePrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Loyalty Card: " + hasLoyaltyCard);
        System.out.println("Base Total: $" + baseTotal);
        System.out.println("Tax Amount (8%): $" + taxAmount);
        System.out.println("Discount: $" + discount);
        System.out.println("Final Total: $" + finalTotal);

        ;


        generateReceipt(customerName, finalTotal);
    }

    public static double calculateTax(double amount, double taxRate) {
        return amount + (amount * taxRate);
    }

    public static void generateReceipt(String name, double finalAmount) {
        System.out.println("\n===== Cafe Receipt =====");
        System.out.println("Customer: " + name);
        System.out.println("Final Total: $" + String.format("%.2f", finalAmount));
        System.out.println("========================");

        System.out.println();
        System.out.println(" Thank you ! ");
    }
}

