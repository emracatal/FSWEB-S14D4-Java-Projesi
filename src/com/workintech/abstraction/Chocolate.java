package com.workintech.abstraction;

public class Chocolate extends ProductForSale{
    private int cacaoRate;

    public Chocolate(String type, int price, String description, int cacaoRate) {
        super(type, price, description);
        this.cacaoRate=cacaoRate;
    }

    @Override
    public void showDetails() {
        System.out.println("this is Chocolate class");

        System.out.println("type: "+super.getType()+" price: "+super.getPrice()+" description: "+super.getDescription()+" cacaoRate: "+cacaoRate);
    }
}
