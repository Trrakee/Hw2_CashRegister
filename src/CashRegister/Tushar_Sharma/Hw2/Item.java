package CashRegister.Tushar_Sharma.Hw2;
/**
 * interface to run the register.
 */
public interface Item {
    /**
     * @param price the cost
     */
    void getPrice(double price);

    /**
     * @param quantity = the amount of items the user is inputting
     *
     */
    void getQuantity(int quantity);

    /**
     * applies selected discount to the cost.
     *
     * @param discountChosen = the discount chose by the user
     */
    void applyDiscount(int discountChosen);

    /**
     * displays various information.
     */
    void displayData();
}
