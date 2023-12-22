package pattern.structural.compose;

public class Demo {
    public static void main(String[] args) {
        IndividualEmployee emp1 = new IndividualEmployee("John Doe");
        IndividualEmployee emp2 = new IndividualEmployee("Alice Smith");
        IndividualEmployee emp3 = new IndividualEmployee("Bob Johnson");

        Department development = new Department("Development");
        development.addEmployee(emp1);
        development.addEmployee(emp2);

        Department sales = new Department("Sales");
        sales.addEmployee(emp3);

        Department company = new Department("Company");
        company.addEmployee(development);
        company.addEmployee(sales);

        company.showDetails();
    }
}
