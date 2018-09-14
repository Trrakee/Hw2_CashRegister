package CashRegister.Tushar_Sharma.Hw2;

import java.util.Scanner;

public class Test_CashRegister {
    public static void main(String[]args) {
        Scanner test = new Scanner(System.in);
        int input = test.nextInt();
        Item testItem = new registerSystem();
        testItem.getPrice(300);
        testItem.getQuantity(3);
        testItem.applyDiscount(4);
        testItem.displayData();
    }

}
