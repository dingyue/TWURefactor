package problem0;

//Understands the components of an order.
public class OrderReceipt {
    private Order order;
    private StringBuilder output;

    public OrderReceipt(Order order) {
        this.order = order;
        output = new StringBuilder();
	}

	public String printReceipt() {

        double totalSalesTax = order.totalSalesTax();
        double totalBill = order.totalBill(totalSalesTax);

        printHeader();
        printCustomerInfo();
        printAllItems();
        printFooter(totalSalesTax, totalBill);

		return output.toString();
	}

    public void printFooter(double totalSalesTax, double totalBill) {
        output.append("Sales Tax").append('\t').append(totalSalesTax);
        output.append("Total Amount").append('\t').append(totalBill);
    }

    public void printHeader() {
        output.append("======Printing Orders======\n");
    }

    public void printCustomerInfo() {
        output.append(order.toString());
    }

    public void printAllItems() {
        for (LineItem lineItem : order.getLineItems()) {
            printItemInfo(lineItem);
        }
    }

    public void printItemInfo(LineItem lineItem) {
        output.append(lineItem.toString());
    }
}