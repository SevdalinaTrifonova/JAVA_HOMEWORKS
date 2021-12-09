package encapsulation;

import java.util.ArrayList;

public class Person {
    private final ArrayList<Product> shoppingBag = new ArrayList<>();
    private String name;
    private double money;
    private boolean error = false;

    public boolean hasError() {
        return error;
    }

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("System: Name cannot be empty");
            this.error = true;
        }
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("System: Money cannot be negative");
            this.error = true;
        }
    }

    public void buyProduct(Product product) {

        if (this.getMoney() < product.getCost()) {
            System.out.printf("%s can't afford %s%n", this.getName(), product.getName());
        } else {
            shoppingBag.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
        }
    }

    public void printShoppingBag() {

        if (this.shoppingBag.isEmpty()) {
            System.out.printf("%s - Nothing bought%n", this.getName());
            return;
        }
        StringBuilder bagItems = new StringBuilder();
        for (Product product :
                this.shoppingBag) {
            if (bagItems.length() > 0) {
                bagItems.append(",");
            }
            bagItems.append(product.getName());
        }
        System.out.printf("%s - %s%n", this.getName(), bagItems);
    }
}