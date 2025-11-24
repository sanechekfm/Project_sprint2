package model;

import static model.constants.Discount.NO_DISCOUNT;
public class Meat extends Food {
    public Meat(int amount, double price) {
        setAmount(amount);
        setPrice(price);
        setVegetarian(false);
    }
    @Override
    public double getDiscount() {
        return NO_DISCOUNT;
    }
}
