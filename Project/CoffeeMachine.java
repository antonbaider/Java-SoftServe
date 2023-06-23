package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int money = 550;
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int cups = 9;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy" -> buyCoffee(scanner);
                case "fill" -> fillSupplies(scanner);
                case "take" -> takeMoney();
                case "remaining" -> printMachineState();
                case "exit" -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void buyCoffee(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();

        if (choice.equals("back")) {
            return;
        }

        switch (choice) {
            case "1" ->
                    makeCoffee(250, 0, 16, 4);
            case "2" ->
                    makeCoffee(350, 75, 20, 7);
            case "3" ->
                    makeCoffee(200, 100, 12, 6);
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int cost) {
        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded && cups >= 1) {

            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            cups -= 1;
            money += cost;
            System.out.println("I have enough resources, making you a coffee!");

        } else {
            if (water < waterNeeded) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < milkNeeded) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeans < coffeeBeansNeeded) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    private static void fillSupplies(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        int addedWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addedMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addedCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int addedCups = scanner.nextInt();

        water += addedWater;
        milk += addedMilk;
        coffeeBeans += addedCoffeeBeans;
        cups += addedCups;

    }

    private static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void printMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println(money + " of money");

    }

}
