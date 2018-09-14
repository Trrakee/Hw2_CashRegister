package CashRegister.Tushar_Sharma.Hw2;
public interface Item {
    float getPrice(float price);
    int getQuantity(int quantity);
    float applyDiscount(int discountChosen);
    void displayData();
}
