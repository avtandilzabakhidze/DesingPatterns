package pattern.behavioral.templateMethod;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Preparing coffee:");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println("\nPreparing tea:");
        Beverage tea = new Tea();
        tea.prepareBeverage();
    }
}
