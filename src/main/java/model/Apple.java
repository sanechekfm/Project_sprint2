package model;
import java.util.Objects;

import static model.constants.Colour.RED_COLOUR;
import static model.constants.Discount.NO_DISCOUNT;
import static model.constants.Discount.RED_APPLE_DISCOUNT;
public class Apple extends Food {
    private final String colour;
    public Apple(int amount, double price, String colour) {
        setAmount(amount);
        setPrice(price);
        this.colour = colour;
        setVegetarian(true);
    }
    @Override
    public double getDiscount() {
        return Objects.equals(colour, RED_COLOUR) ?
            RED_APPLE_DISCOUNT : NO_DISCOUNT;
        }
    }