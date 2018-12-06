import java.util.Scanner;

public class DataPool {
    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        int days;
        int numberOfDays = 1;
        int numberOfSupplies;
        int numberOfItems;
        int amountOfSupplies = 1;
        int costOfSupplies = 0;
        int productCost;
        int supplyItem;
        int amountSupply;
        double totalProfit;
        float sales;
        float price1;


        System.out.println("Welcome to the Manufacturing Calculator");
        System.out.println();
        System.out.println("Please enter the number of supplies required for your manufacturing process");
        numberOfSupplies = keyboard.nextInt();
        System.out.println("Please enter the number of days of sale");
        days = keyboard.nextInt();
        do {
            System.out.println("What is the cost of Supply Item " + amountOfSupplies + "?");
            supplyItem = keyboard.nextInt();
            System.out.println("How many did you buy of Supply Item " + amountOfSupplies + "?");
            amountSupply = keyboard.nextInt();
            productCost = (supplyItem*amountSupply);
            costOfSupplies = (productCost+costOfSupplies);
            amountOfSupplies++;
        } while (amountOfSupplies <= numberOfSupplies);
            System.out.println("The calculated total cost of all your supplies is: $" + costOfSupplies);
        do {
            System.out.println("How much did you sell each made item for on Day " + numberOfDays);
            price1 = keyboard.nextInt();
            System.out.println("How many items did you sell on Day " + numberOfDays);
            numberOfItems = keyboard.nextInt();
            sales = (numberOfItems*price1);
            numberOfDays++;
        } while (numberOfDays<=days);
        System.out.println("The calculated total sales is: $" + sales);
        totalProfit = (sales-costOfSupplies);
        System.out.println();
        System.out.println("The calculated profit is: $" + totalProfit);

    }
}