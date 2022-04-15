package practice;
import java.util.Scanner;

public class NewCoffeeCalc 
{
    static double costPerCupByYear(double machinePrice, double accessoryPrice,
                                double coffeePricePerGram, int oneCupCoffee,int howManyCoffee, int year)
    {
        return (machinePrice + accessoryPrice + (coffeePricePerGram * oneCupCoffee *
                                                howManyCoffee * year)) / (365 * year * howManyCoffee);
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator of your coffee!");
        System.out.print("Please Enter the price of your coffee machine: $");
        double machinePrice = input.nextDouble();
        System.out.print("Please Enter the price of your coffee accessories: $");
        double accessoryPrice = input.nextDouble();
        System.out.print("Please Enter the price of your coffee bean package: $");
        double coffeePrice = input.nextDouble();
        System.out.print("Please Enter the weight of your coffee bean package
        (gram): ");
        int weight = input.nextInt();
        double coffeePricePerGram = coffeePrice / weight;
        System.out.print("Please Enter the quantity of coffee for 1 cup of
        coffee(gram): ");
        int oneCupCoffee = input.nextInt();
        System.out.print("How many coffee do you make a day?: ");
        int howManyCoffee = input.nextInt();
        System.out.println("A cup of coffee price will be...");
        for (int year = 1; year < 6; year++) 
        {
            System.out.printf("If you use this machine about %d year(S) : $%.2f per cup!\n",
                                year, costPerCupByYear(machinePrice, accessoryPrice,
                                coffeePricePerGram, oneCupCoffee, howManyCoffee, year));
        }
    }
}
