import java.util.Scanner;


public class DataPool {
    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        int days;
        int numberOfSupplies;
        int numberOfDays = 1;
        int amountOfSupplies = 1;
        float sales;
        float price1;
        float supplyItem;
        float totalProfit;
        float productCost;
        float amountSupply;
        float numberOfItems;
        float salesCost = 0;
        float costOfSupplies = 0;
        String again = "";

        do {
            System.out.println("Welcome to the Manufacturing Calculator");
            System.out.println();
            System.out.println("Please enter the number of supplies required for your manufacturing process");
            numberOfSupplies = keyboard.nextInt();
            System.out.println("Please enter the number of days of sale");
            days = keyboard.nextInt();
            do {
                System.out.println("How many did you buy of Supply Item " + amountOfSupplies + "?");
                amountSupply = keyboard.nextFloat();
                System.out.println("What is the cost of Supply Item " + amountOfSupplies + "?");
                supplyItem = keyboard.nextFloat();
                productCost = (supplyItem * amountSupply);
                costOfSupplies = (productCost + costOfSupplies);
                amountOfSupplies++;
            } while (amountOfSupplies <= numberOfSupplies);
            System.out.println("The calculated total cost of all your supplies is: $" + costOfSupplies);
            System.out.println();
            do {
                System.out.println("How many items did you sell on Day " + numberOfDays + "?");
                numberOfItems = keyboard.nextFloat();
                System.out.println("How much did you sell each made item for on Day " + numberOfDays + "?");
                price1 = keyboard.nextFloat();
                sales = (numberOfItems * price1);
                salesCost = (sales + salesCost);
                numberOfDays++;
            } while (numberOfDays <= days);
            System.out.println("The calculated total sales is: $" + sales);
            totalProfit = (salesCost - costOfSupplies);
            System.out.println();
            System.out.println("The calculated profit is: $" + totalProfit);

                System.out.println("Do you want to run the program again? Yes/No");
                keyboard.nextLine();
                again = keyboard.nextLine();
            } while (again.equalsIgnoreCase("Yes")) ;
    }
}