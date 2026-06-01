public class CartItem {
    private String itemName;
    private int quantity;
    private int totalPrice;

    public CartItem(String itemName, int quantity, int totalPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void displayCartItem() {
        System.out.println(itemName + " x " + quantity + " = Rs." + totalPrice);
    }

    @Override
    public String toString() {
        return itemName + " x " + quantity + " = Rs." + totalPrice;
    }
}












