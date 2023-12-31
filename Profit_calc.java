package Profit_calc;
import java.util.Scanner;

public class Profit_calc {
	public static double getProfit(double revenue, double expenses) {
		return revenue - expenses;
	}
	
	public static double getProfitChange(double currentProfit, double previousProfit) {
		return ((currentProfit - previousProfit) / previousProfit) * 100;
	}
	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter revenue : ");
        double revenue = input.nextDouble();

        System.out.print("Enter expenses : ");
        double expenses = input.nextDouble();

        System.out.print("Enter previous profit : ");
        double previousProfit = input.nextDouble();
        
        double currentProfit = getProfit(revenue, expenses);
        System.out.println("Your current profit is : $" + currentProfit);
        
        double ProfitChange = getProfitChange(currentProfit, previousProfit);
        System.out.print("Your profit Change percentage is : " + ProfitChange + "%");
        
    }
}