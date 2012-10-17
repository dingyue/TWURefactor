package problem0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Understands the calculate the purchase for every receipt.
public class Order {
    public static final double SALES_TAX_RATE = 0.10;
    private String customerName;
    private String customerAddress;
    List<LineItem> goodsList;

    public Order(String customerName, String customerAddress, List<LineItem> goodsList) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.goodsList = goodsList;
    }

    public Order(ArrayList<LineItem> listOfItems) {
        this.goodsList = listOfItems;
    }

    public List<LineItem> getLineItems() {
        return Collections.unmodifiableList(goodsList);
    }

    public double totalSalesTax() {
        double totalSalesTax = 0.0;
        for (LineItem lineItem : goodsList) {
            totalSalesTax += lineItem.totalAmount() * SALES_TAX_RATE;
        }
        return totalSalesTax;
    }

    public double totalBill(double totalSalesTax) {
        double subtotal = subtotal();
        return subtotal + totalSalesTax;
    }

    private double subtotal() {
        double subtotal=0;
        for (LineItem lineItem : getLineItems()) {
            subtotal += lineItem.totalAmount();
        }
        return subtotal;
    }

    @Override
    public String toString() {
        return customerName + customerAddress;
    }

}
