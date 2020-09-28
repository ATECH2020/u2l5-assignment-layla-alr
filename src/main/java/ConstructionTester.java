import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numBoards; 
        int numWindows; 
        double lumCost = 8.0;
        double windCost= 11.0;
        double taxRate;
        double total; 

        //get user input
        System.out.println("How many boards will you need?");
        numBoards = in.nextInt();
        System.out.println("How many windows will you need?");
        numWindows= in.nextInt();
        System.out.println("What's the tax rate?");
        taxRate= in.nextDouble();

        //Create object and Print total and grand total
        Construction user = new Construction(lumCost, windCost, taxRate);
        total = user.lumberCost(numBoards) + user.windowCost(numWindows);
        System.out.println("Total: "+ total);
        System.out.print("Grand total: "+ user.grandTotal(total));
    }
}
