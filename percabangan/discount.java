import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.println("Enter the price of the product: ");
            double price = inputan.nextDouble();

            System.out.println("Enter the quantity of the product: ");
            int quantity = inputan.nextInt();

            double totalAmount = price * quantity;

            if (quantity >= 100) {
                double discount = totalAmount * 0.15;
                totalAmount = totalAmount - discount;
                System.out.println("You have availed a discount of 15%. The total amount after discount is: " + totalAmount);
            } else if (quantity >= 50) {
                double discount = totalAmount * 0.10;
                totalAmount = totalAmount - discount;
                System.out.println("You have availed a discount of 10%. The total amount after discount is: " + totalAmount);
            } else if (quantity >= 10) {
                double discount = totalAmount * 0.05;
                totalAmount = totalAmount - discount;
                System.out.println("You have availed a discount of 5%. The total amount after discount is: " + totalAmount);
            } else {
                System.out.println("No discount available. The total amount is: " + totalAmount);
            }
        }
    }
}
    
