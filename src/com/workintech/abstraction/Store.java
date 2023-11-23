package com.workintech.abstraction;

public class Store {
    public static void main(String[] args) {
        ProductForSale bread1=new Bread("beyaz",15,"beyaz ekmek","beyaz");
        ProductForSale chocolate1=new Chocolate("bitter",20,"bitter çikolata",80);
        ProductForSale coke=new Coke("zero sugar",30,"zero sugar with aspartam");
        listProducts(new ProductForSale[]{bread1, chocolate1, coke});
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i=0;i<products.length;i++){
            products[i].showDetails();
        }
    }
}