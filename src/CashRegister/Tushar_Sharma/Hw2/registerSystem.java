package CashRegister.Tushar_Sharma.Hw2;

public class registerSystem implements Item {
    /**
     * Variables.
     */
    private double costBeforeDiscount;
    private double subTotal;
    private int numOfItems;
    private double costAfterDiscount;
    private double discountCalculated;
    private double totalDiscount;

    /**
     * @param price = the cost of the item
     */
    @Override
    public void getPrice(double price) {
        costBeforeDiscount = price;
    }

    /**
     * @param quantity = the amount of items the user is inputting
     */
    @Override
    public void getQuantity(int quantity) {
        numOfItems = quantity;
    }

    /**
     * @param discountChosen selects and manipulates the price according to the discount.
     */
    @Override
    public void applyDiscount(int discountChosen) {
        switch (discountChosen) {
            case 1:
                // %10 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * 0.1;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 2:
                // %20 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .2;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 3:
                // %50 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .5;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 4:
                // %75 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .75;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 5:
                // %90 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .9;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 6:
                // %99 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .99;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 7:
                // %100 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * 1;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 8:
                // Senior Citizen Discount %25 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .25;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 9:
                //no discount
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                costAfterDiscount = costBeforeDiscount;
                break;
            case 10:
                //%10 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * 0.1;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 20:
                // %20 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .2;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 25:
                // Senior Citizen Discount %25 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .25;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 50:
                // %50 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .5;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 75:
                // %75 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .75;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 90:
                // %90 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .9;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 99:
                // %99 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * .99;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            case 100:
                // %100 off
                costBeforeDiscount = costBeforeDiscount * numOfItems;
                discountCalculated = costBeforeDiscount * 1;
                costAfterDiscount = costBeforeDiscount - discountCalculated;
                break;
            default:
                System.out.println("Please enter a valid discount.");
                System.exit(123);
                break;
        }
        subTotal += costAfterDiscount;
        totalDiscount += discountCalculated;
        displayData();
        costAfterDiscount = 0;
        discountCalculated = 0;
    }

    /**
     * display the receipt / information such as subtotal, total, and discount savings.
     */
    @Override
    public void displayData() {
        String title = "\n        |Your Receipt|";
        if (totalDiscount < 1.00 && totalDiscount > .001) {
            System.out.printf("%s" +
                    "\n____________________________________\n" +
                    "Your subtotal is: $%.2f\n" +
                    "\nYour total today is: $%.2f\n" +
                    "You saved $%.2f cents\n" +
                    "------------------------------------\n", title, costAfterDiscount, subTotal, totalDiscount);
        } else if (totalDiscount == 0) {
            System.out.printf("%s" +
                    "\n____________________________________\n" +
                    "\nYour subtotal is: $%.2f\n" +
                    "Your total today is: $%.2f\n" +
                    "------------------------------------\n", title, costAfterDiscount, subTotal);
        } else {
            System.out.printf("%s" +
                    "\n____________________________________\n" +
                    "\nYour subtotal is: $%.2f\n" +
                    "Your total today is: $%.2f\n" +
                    "You saved $%.2f\n" +
                    "------------------------------------\n", title, costAfterDiscount, subTotal, totalDiscount);
        }
    }
}
