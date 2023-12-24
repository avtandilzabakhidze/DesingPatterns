package pattern.behavioral.visitor;

public interface ShoppingCartItem {
    void accept(Visitor visitor);
}
