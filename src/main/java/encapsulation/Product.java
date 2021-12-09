package encapsulation;

public class Product {
    private String name;
    private double cost;
    private boolean error = false;

    public String getName() {
        return name;
    }
    public boolean hasError() {
        return error;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else {
            System.out.println("System: Name cannot be empty.");
            this.error =true;
        }
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0)
            this.cost = cost;
        else {
            System.out.println("System:Cost cannot be negative");
            this.error = true;
        }
    }
    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

}
