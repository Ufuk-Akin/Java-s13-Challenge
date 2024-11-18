package employeeApp;

public enum Plan {
    PLAN1 ("Basic Plan" , 100.0),
    PLAN2 ("Average Plan" , 200.0),
    PLAN3("Premium Plan" , 300.0),;

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
