package pattern.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance("singleton 1");
        Singleton instance2 = Singleton.getInstance("singleton 2");
        Singleton instance3 = Singleton.getInstance("singleton 3");

        //output be singleton 1
        System.out.println(instance1.getValue());
        System.out.println(instance2.getValue());
        System.out.println(instance3.getValue());
    }
}
