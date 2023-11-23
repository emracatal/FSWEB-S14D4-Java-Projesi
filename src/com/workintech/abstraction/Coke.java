package com.workintech.abstraction;

public class Coke extends ProductForSale{
    private boolean isHealthy;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.isHealthy=true;
    }

    @Override
    public void showDetails() {
        System.out.println("this is Coke class");
        System.out.println("type: "+super.getType()+" price: "+super.getPrice()+" description: "+super.getDescription()+" isHealthy: "+isHealthy);

    }
}
