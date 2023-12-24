package pattern.behavioral.visitor;

public class DiscountedItemVisitor {
    public void visit(RegularItem item) {
        System.out.println("Applying extra discount to regular item.");
        // Calculate extra discount logic for regular item if needed
    }

    public void visit(DiscountedItem item) {
        System.out.println("Applying extra discount to discounted item.");
        // Calculate extra discount logic for discounted item if needed
    }
}
