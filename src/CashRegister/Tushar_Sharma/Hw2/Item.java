package CashRegister.Tushar_Sharma.Hw2;
public interface Item {
    double getPrice(double price);
    int getQuantity(int quantity);
    double applyDiscount(int discountChosen);
    void displayData();
}
