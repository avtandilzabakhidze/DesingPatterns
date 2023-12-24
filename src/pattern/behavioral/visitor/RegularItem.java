package pattern.behavioral.visitor;

public class RegularItem  implements ShoppingCartItem {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // Other methods and properties specific to regular items
}