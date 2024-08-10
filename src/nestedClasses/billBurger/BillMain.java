package nestedClasses.billBurger;

public class BillMain {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("KETCHUP", "MAYO", "BACON", "cheeder");
        System.out.println(regularMeal);

        Meal regularMeal1 = new Meal(0.5);
        System.out.println(regularMeal1);

    }
}
