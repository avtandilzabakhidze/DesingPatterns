package pattern.behavioral.visitor;

public class DiscountedItem implements ShoppingCartItem {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // Other methods and properties specific to discounted items
}