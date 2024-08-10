package nestedClasses.billBurger;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this( 1);
    }

    public Meal(double conversionRate){
        this.conversionRate = conversionRate;
        this.burger = new Burger("regular");
        this.drink = new Item("cock" , "drink", 1.5);
        System.out.println(drink.name);
        this.side = new Item("fries" , "side", 2.0);
    }

    public double getTotal(){
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }
    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total Due:", getTotal());
    }

    public  void addToppings(String... selectedToppings){
        burger.addToppings(selectedToppings);
    }


    private class Item {
        private  String name;
        private  String type;
        private double price;

        public Item(String name, String type) {
            this(name , type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.type = type;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(name, type, getPrice(price, conversionRate));
        }

        public static double getPrice(double price, double rate){
            return price * rate;
        }
    }

    private class Burger extends Item{

        private enum Extra {AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;
            private double getPrice(){
                return switch (this) {
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE ->1.5;
                    default -> 0.0;
                };
            }
        }

        private List<Item> toppings = new ArrayList<>();
        Burger(String name){
            super(name, "burger", 5.00);
        }
        public double getPrice(){
            double total = super.price;
            for (Item topping: toppings) {
                total += topping.price;
            }
            return total;
        }

        public void addToppings(String... selectedToppings){

            for (String selectedTopping : selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                }  catch (IllegalArgumentException e){
                    System.out.println("No toppoing found for "+ selectedTopping);
                }

            }
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for (Item topping: toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }
}
