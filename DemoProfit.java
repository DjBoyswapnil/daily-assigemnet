import java.util.Scanner;
class DemoProfit
{	
	public static void main(String args[])
	{
		int sp,cp,profit;
		Scanner sc=new Scanner(System.in);
		// Entering Selling price
		System.out.println("Enter the selling Price");
		sp=sc.nextInt();
		//Entering Cost price
		System.out.println("Enter the cost price");
		cp=sc.nextInt();
		//profit will be calculate
		profit=sp-cp;
		System.out.println("the profit is="+profit);
	}
}