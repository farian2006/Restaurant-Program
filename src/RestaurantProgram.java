import java.util.Scanner;
import java.util.ArrayList;

public class RestaurantProgram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

//       Welcome Message
        System.out.println("Welcome To VillageVibe! ");

//        Menu Bar
        String[] mainDishes={"Chicken Biryani","Beef Biryani","Vegetable Fried Rice", "Grilled Chicken with Rice","Fish Curry with Steamed Rice"};
        double[] mainDishesPrice={250, 300, 130, 280, 270};
        String[] starterDishes={"Chicken Spring Rolls","Vegetable Samosa","French Fries","Chicken Soup","MashRoom Soup"};
        double[] starterDishesPrice={120, 100, 80, 150, 160};
        String[] snacksMeals={"Burger","SandWitch","Shawarma"};
        double[] snacksMealsPrice={0, 200, 0};  //0 For Variant Type Price
        String[] desertsList={"Chocolate Ice Cream","Vanilla Ice Cream","Cheesecake","Chocolate Brownie"};
        double[] desertListPrice={120, 100, 220, 200};
        String[] drinksList={"Mango Milkshake","Cappuccino","Cold Coffee","Fresh Orange Juice","Lemon Iced Tea"};
        double[] drinksListPrice={180, 200, 150, 170, 160};
        String[] burgerList={"BBQ Burger","Cheese Burger","Classic Burger","Veggie Burger"};
        double[] burgerPrice={250, 230, 200, 180};
        String[] shawarmaList={"Chicken Shawarma","Beef Shawarma","Vegetable Shawarma"};
        double[] shawarmaPrice={200,220,170};

        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Double> cartPrices = new ArrayList<>();

        // Customer Choice
        boolean isRunning =true;
        while (isRunning) {
            System.out.println("----- Restaurant Menu -----");
            System.out.println("1. Main Dishes");
            System.out.println("2. Starters & Sides");
            System.out.println("3. Snacks & Meals");
            System.out.println("4. Desserts");
            System.out.println("5. Drinks");
            System.out.println("6. Exit");
            System.out.println("7. See Cart ");
            System.out.print("Enter your choice: ");

            System.out.print("Enter A Choice(1-7): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Show Main Dishes
                    System.out.println("***** Main Dishes *****");
                    for (int i = 0; i < mainDishes.length; i++) {
                        System.out.println((i + 1) + ". " + mainDishes[i]);
                    }

                    // Prompt user again
                    System.out.print("Select a Main Dish (1-" + mainDishes.length + "): ");
                    int subChoice1 = sc.nextInt();

                    if (subChoice1 >= 1 && subChoice1 <= mainDishes.length) {
                        System.out.println("Selected Item:  " + mainDishes[subChoice1 - 1]);
//                        Cart Add
                        cart.add(mainDishes[subChoice1 - 1]);
                        cartPrices.add(mainDishesPrice[subChoice1 - 1]);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    System.out.println("***** Starters *****");
//                    Show Starters
                    for(int i=0;i<starterDishes.length;i++){
                        System.out.println((i+1)+"."+starterDishes[i]);
                    }
//                    Prompt User Again
                    System.out.print("Select a Starter  (1-" + starterDishes.length + "): ");
                    int subChoice2=sc.nextInt();
                    if (subChoice2 >= 1 && subChoice2 <= starterDishes.length) {
                        System.out.println("Selected Item:  " + starterDishes[subChoice2 - 1]);
//                        Cart Add
                        cart.add(starterDishes[subChoice2 - 1]);
                        cartPrices.add(starterDishesPrice[subChoice2 - 1]);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
//                   Show  Snacks & Meals
                    System.out.println("***** Snacks & Meals *****");
                    for (int i = 0; i < snacksMeals.length; i++) {
                        System.out.println((i + 1) + "." + snacksMeals[i]);
                    }

                    // If user selects Burger -> show burger types
                    System.out.print("Choose item (1-3): ");
                    int subChoice3 = sc.nextInt();
                    if (subChoice3 == 1) {
                        for (int i=0;i<burgerList.length;i++) {
//                           Burger Array Access
                            System.out.println((i + 1) + "." + burgerList[i]);

                        }
                        // Burger Case
                        System.out.println("Burger Variants: Choose  a Burger Type");
                        int subBurgerChoice=sc.nextInt();
                        if (subBurgerChoice >= 1 && subBurgerChoice <= burgerList.length) {
                            System.out.println("Selected Item:  " + burgerList[subBurgerChoice - 1]);
//                           Cart Add
                            cart.add(burgerList[subBurgerChoice - 1]);
                            cartPrices.add(burgerPrice[subBurgerChoice - 1]);
                        } else {
                            System.out.println("Invalid choice!");
                        }

                    }
                    else if(subChoice3==2){
                        // SandWitch Case
                        System.out.println("Selected Item: "+ snacksMeals[subChoice3-1]);
//                        Cart Add
                        cart.add(snacksMeals[subChoice3 - 1]);
                        cartPrices.add(snacksMealsPrice[subChoice3 - 1]);
                    }
                    else if (subChoice3==3) {
                        // Shawarma Case
                        System.out.println("Shawarma Variants:");
                        for (int i=0;i<shawarmaList.length;i++) {
//                          Shawarma Array Access
                            System.out.println((i + 1) + "." + shawarmaList[i]);
                        }
                        System.out.println("Shawarma Variants: Choose  a Shawarma Type");
                        int subShawarmaChoice=sc.nextInt();
                        if (subShawarmaChoice >= 1 && subShawarmaChoice <= shawarmaList.length) {
                            System.out.println("Selected Item:  " + shawarmaList[subShawarmaChoice - 1]);
//                           Cart Add
                            cart.add(shawarmaList[subShawarmaChoice - 1]);
                            cartPrices.add(shawarmaPrice[subShawarmaChoice - 1]);
                        } else {
                            System.out.println("Invalid choice!");
                        }
                    }
                    else {
                        System.out.println("Invalid Choice! ");
                    }
                    break;
                case 4:
//                    Desert Case
                    System.out.println("Deserts");
//                    Desert Array Access
                    for(int i=0;i<desertsList.length;i++){
                        System.out.println((i+1)+"."+desertsList[i]);
                    }
//                    Choose From Desert
                    System.out.println("Desert Variants: Choose  a Desert Type");
                    int desertSubChoice=sc.nextInt();
                    if (desertSubChoice >= 1 && desertSubChoice <= desertsList.length) {
                        System.out.println("Selected Item:  " + desertsList[desertSubChoice - 1]);
//                        Cart Add
                        cart.add(desertsList[desertSubChoice - 1]);
                        cartPrices.add(desertListPrice[desertSubChoice - 1]);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                case 5:
                    System.out.println("Drinks");
//                    Drinks Array Access
                    for(int i=0;i<drinksList.length;i++){
                        System.out.println((i+1)+"."+drinksList[i]);
                    }
//                    Drink Sub Choice
                    System.out.println("Drink Variants: Choose A Drink Type");
                    int drinkSubChoice=sc.nextInt();
                    if (drinkSubChoice >= 1 && drinkSubChoice <= drinksList.length) {
                        System.out.println("Selected Item:  " + drinksList[drinkSubChoice - 1]);
//                        Cart Add
                        cart.add(drinksList[drinkSubChoice - 1]);
                        cartPrices.add(drinksListPrice[drinkSubChoice - 1]);
                    } else {
                        System.out.println("Invalid choice!");
                    }break;
                case 6 :
                    System.out.println("Thank You For Your Order!");
                    isRunning=false;
                    break;
                case 7:
                    boolean inCartMenu = true;
                    while (inCartMenu) {
                        System.out.println("\n***** Your Cart *****");
                        if (cart.isEmpty()) {
                            System.out.println("Your cart is empty!");
                        } else {
                            double total = 0;
                            for (int i = 0; i < cart.size(); i++) {
                                System.out.println((i + 1) + ". " + cart.get(i) + " - " + cartPrices.get(i) + " TK");
                                total += cartPrices.get(i);
                            }
                            System.out.println("----------------------------");
                            System.out.println("Total Bill: " + total + " TK");
                        }

                        // Cart options
                        System.out.println(" Cart Options: ");
                        System.out.println("1. Remove an Item");
                        System.out.println("2. Confirm Order");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Choose an option: ");
                        int cartChoice = sc.nextInt();

                        switch (cartChoice) {
                            case 1:
                                if (cart.isEmpty()) {
                                    System.out.println("Cart is empty! Nothing to remove.");
                                } else {
                                    System.out.print("Enter item number to remove: ");
                                    int removeIndex = sc.nextInt();
                                    if (removeIndex >= 1 && removeIndex <= cart.size()) {
                                        System.out.println("Removed: " + cart.get(removeIndex - 1));
                                        cart.remove(removeIndex - 1);
                                        cartPrices.remove(removeIndex - 1);
                                    } else {
                                        System.out.println("Invalid item number!");
                                    }
                                }
                                break;

                            case 2:
                                if (cart.isEmpty()) {
                                    System.out.println("Cart is empty! Add items before confirming.");
                                } else {
                                    System.out.println("✅ Order Confirmed! Thank you for ordering.");
                                    cart.clear();
                                    cartPrices.clear();
                                }
                                break;

                            case 3:
                                inCartMenu = false; // Go back to main menu
                                break;

                            default:
                                System.out.println("Invalid choice in cart!");
                        }
                    }
                    break;
                default:
                    System.out.println("Sorry This Choice is not available yet!");
            }
        }
    }
}