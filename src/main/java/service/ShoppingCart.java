package service;
import model.Food;

public class ShoppingCart {
    private Food[] cart;
    public ShoppingCart(Food[] cart) {
        this.cart = cart;
    }
    public double getTotalAmountWithoutDiscount() {
        double amount = 0;
        for (int i = 0; i < cart.length; i++) {
            amount += cart[i].getAmount() * cart[i].getPrice();
        }
        return amount;
    }
    public double getTotalAmountWithDiscount() {
        double amount = 0;
        for (int i = 0; i < cart.length; i++) {
            amount += cart[i].getAmount() * cart[i].getPrice() * ((100 - cart[i].getDiscount()) / 100);
        }
        return amount;
    }
    public double getVegetarianAmountWithoutDiscount() {
        double amount = 0;
        for (int i = 0; i < cart.length; i++) {
            if (cart[i].isVegetarian()) {
                amount += cart[i].getAmount() * cart[i].getPrice();
            }
        }
        return amount;
    }
}
