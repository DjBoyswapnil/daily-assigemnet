import java.util.Scanner;
class DemoMath
{
	public static void main(String  args[])
{	
	int num1,num2,res;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the two Numbers");
	num1=sc.nextInt();
	num2=sc.nextInt(); 
	res=num1+num2;
	System.out.println("Add is="+res);
	res=num1-num2;
	System.out.println("sub is="+res);
	res=num1*num2;
	System.out.println("multi is="+res);
	res=num1/num2;
	System.out.println("division is="+res);
	res=num1%num2;
	System.out.println("mod is="+res);
	}

}


	