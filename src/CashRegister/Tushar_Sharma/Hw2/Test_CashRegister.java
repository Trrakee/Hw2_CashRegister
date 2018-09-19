package CashRegister.Tushar_Sharma.Hw2;

import java.util.Scanner;

/**
 * Test class to implement methods and the item interface.
 */
public class Test_CashRegister {
    /**
     * Main method of the test class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        boolean shopping = true;
        Item testItem = new registerSystem(); // create a register system
        System.out.print("\n        Welcome to some store:\n");
        while (shopping) {
            Scanner price = new Scanner(System.in); // get price of item
            System.out.print("Please enter the price of your item: $");
            double priceEntered = price.nextDouble();
            testItem.getPrice(priceEntered);
            Scanner quantity = new Scanner(System.in); // get quantity of item entered
            System.out.print("Please enter the quantity of the items: ");
            int quantityEntered = quantity.nextInt();
            testItem.getQuantity(quantityEntered);
            Scanner discount = new Scanner(System.in); // get discount to apply
            System.out.print(" ___________________________________________________________________________________________________________________" +
                    "\n| 1. 10% | 2. 20% | 3. 50% | 4. 75% | 5. 90% | 6. 99% | 7. 100% | 8. Senior Citizen Discount (25%) | 9. No Discount |\n" +
                    " -------------------------------------------------------------------------------------------------------------------\n");
            System.out.print("Please choose your discount: ");
            int discountEntered = discount.nextInt();
            testItem.applyDiscount(discountEntered);
            Scanner anotherOne = new Scanner(System.in);
            System.out.print("\nDo you have another item to scan?\nYes or No?\n");
            String answer = anotherOne.next();
            // user input to determine if more items or not
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                System.out.println();
            } else {
                shopping = false;
                System.out.println("\nThank you for shopping at some store.\nHave a great day!");
                System.exit(219);
            }
        }
    }
}
