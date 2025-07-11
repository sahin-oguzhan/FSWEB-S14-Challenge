package org.example.models;

public class Hamburger {
    private StringBuilder order = new StringBuilder();
    private String name;
    private String breadRollType;
    private String meat;
    private double price;


    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public StringBuilder getOrder() {
        return order;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        order.append("Name: ").append(name).append("\n");
        order.append("Meat: ").append(meat).append("\n");
        order.append("BreadRollType: ").append(breadRollType).append("\n");

    }

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
        getOrder().append("Addition1: ").append(addition1Name).append("\n");
        setPrice(getPrice() + price);
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
        getOrder().append("Addition1: ").append(addition2Name).append("\n");
        setPrice(getPrice() + price);
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
        getOrder().append("Addition1: ").append(addition3Name).append("\n");
        setPrice(getPrice() + price);
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
        getOrder().append("Addition1: ").append(addition4Name).append("\n");
        setPrice(getPrice() + price);
    }

    public void itemizeHamburger() {
        getOrder().append("Price: ").append(getPrice()).append("\n");
        System.out.println(getOrder());
    }
}
