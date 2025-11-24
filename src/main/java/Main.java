import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_COLOUR;
import static model.constants.Colour.RED_COLOUR;

public class Main {
    public static void main(String[] args){

        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, RED_COLOUR);
        Food appleGreen = new Apple(8, 60, GREEN_COLOUR);

        Food[] cart = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(cart);

        System.out.printf("Общая сумма товаров без скидки: %.2f рублей.%n", shoppingCart.getTotalAmountWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f рублей.%n", shoppingCart.getTotalAmountWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f рублей.%n", shoppingCart.getVegetarianAmountWithoutDiscount());

    }
}
