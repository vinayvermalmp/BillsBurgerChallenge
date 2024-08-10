// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("DRINK", "coke", 10.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();

//       Burger burger = new Burger("regular", 5.0);
//       burger.addToppings("AVOCADO", "CHEESE", "BACON");
//       burger.printItem();

//       MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("CHEESE", "BACON", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO","CHEESE", "BACON", "LETTUCE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}