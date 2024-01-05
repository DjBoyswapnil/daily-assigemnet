import java.util.Scanner;
class DemoCircle
{
	public static void main(String args[])
	{	

		double r, area, Cir;
		double pi=3.14;
		Scanner sc=new Scanner(System.in);
		// accepting input from user
		System.out.println("Enter the radius of the circle");
		r=sc.nextInt();
		area=pi*r*r;
		Cir=2*pi*r;
		//output screening 
		System.out.println("area of circle is="+area);
		System.out.println("Circumference of circle is="+Cir);
	}
}

		