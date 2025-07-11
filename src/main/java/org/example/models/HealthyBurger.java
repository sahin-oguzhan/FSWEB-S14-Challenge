package org.example.models;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String name,double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    @Override
    public StringBuilder getOrder() {
        return super.getOrder();
    }

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        getOrder().append("HealthyAddition: ").append(healthyExtra1Name).append("\n");
        setPrice(getPrice() + price);
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        getOrder().append("HealthyAddition2: ").append(healthyExtra2Name).append("\n");
        setPrice(getPrice() + price);
    }

    @Override
    public void itemizeHamburger() {
        getOrder().append("Price: ").append(getPrice()).append("\n");
        System.out.println(getOrder());
    }
}
