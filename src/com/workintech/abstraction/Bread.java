package com.workintech.abstraction;

public class Bread extends ProductForSale{
    private String name;

    public Bread(String type, int price, String description,String name) {
        super(type, price, description);
        this.name=name;
    }

    @Override
    public void showDetails() {
        System.out.println("this is Bread class");
        System.out.println("type: "+super.getType()+" price: "+super.getPrice()+" description: "+super.getDescription()+" name: "+name);
    }

}
