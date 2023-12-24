package pattern.behavioral.templateMethod;

public class Coffee  extends Beverage {
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}