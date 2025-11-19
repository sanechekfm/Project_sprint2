package model;

public abstract class Food implements Discountable {
    private int amount; // количество продукта в килограммах
    private double price; // цена за единицу
    private boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}