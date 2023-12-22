package pattern.structural.compose;

class IndividualEmployee implements Employee {
    private String name;

    public IndividualEmployee(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Employee: " + name);
    }
}