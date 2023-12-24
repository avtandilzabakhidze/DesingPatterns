package pattern.behavioral.visitor;

public class RegularItemVisitor {
    public void visit(RegularItem item) {
        System.out.println("Applying regular discount to regular item.");
        // Calculate regular item discount logic
    }

    public void visit(DiscountedItem item) {
        System.out.println("Applying regular discount to discounted item.");
        // Calculate discounted item discount logic differently if needed
    }
}
