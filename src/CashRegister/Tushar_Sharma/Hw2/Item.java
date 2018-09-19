package CashRegister.Tushar_Sharma.Hw2;
/**
 * interface to run the register.
 */
public interface Item {
    /**
     * @param price
     * @return the cost
     */
    void getPrice(double price);

    /**
     * @param quantity
     * @return quantity of items
     */
    void getQuantity(int quantity);

    /**
     * applies selected discount to the cost.
     *
     * @param discountChosen
     */
    void applyDiscount(int discountChosen);

    /**
     * displays various information.
     */
    void displayData();
}
