package pattern.behavioral.visitor;

public interface Visitor {
    void visit(RegularItem item);
    void visit(DiscountedItem item);
}
