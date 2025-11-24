package service;
import model.Food;

public class ShoppingCart {
    private Food[] cart;

    public ShoppingCart(Food[] cart) {
        this.cart = cart;
    }

    public double getTotalAmountWithoutDiscount() {
        double amount = 0;
        for (Food item : cart) {
            amount += item.getAmount() * item.getPrice();
        }
        return amount;
    }

    public double getTotalAmountWithDiscount() {
        double amount = 0;
        for (Food item : cart) {
            amount += item.getAmount() * item.getPrice() * ((100 - item.getDiscount()) / 100.0);
        }
        return amount;
    }

    public double getVegetarianAmountWithoutDiscount() {
        double amount = 0;
        for (Food item : cart) {
            if (item.isVegetarian()) {
                amount += item.getAmount() * item.getPrice();
            }
        }
        return amount;
    }
}