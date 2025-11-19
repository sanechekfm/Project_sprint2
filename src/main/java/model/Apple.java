package model;
import static model.constants.Colour.RED_COLOUR;
import static model.constants.Discount.NO_DISCOUNT;
import static model.constants.Discount.RED_APPLE_DISCOUNT;
public class Apple extends Food {
    String colour;
    public Apple(int amount, double price, String colour) {
        setAmount(amount);
        setPrice(price);
        this.colour = colour;
        setVegetarian(true);
    }
    @Override
    public double getDiscount() {
        if (colour == RED_COLOUR) {
            return RED_APPLE_DISCOUNT;
        } else {
            return NO_DISCOUNT;
        }
    }
}