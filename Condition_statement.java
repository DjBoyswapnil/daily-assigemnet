//WAP to accept choice from user and accordingly display the output
//1:Given no is even or odd
//2:Find out the grade (accept marks of 5 subject)
//3:Accept no and find out cube if no is divisble by 5
//4:Accept 3 nofrom user and find out the greatest

import java.util.Scanner;


public class Condition_statement {

	public static void main(String[] args) {
		int choice,num,m1,m2,m3,m4,m5,total,res,num1,num2,num3,num5;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Given no is even or odd\r\n"+
				 "2:Find out the grade (accept marks of 5 subject)\r\n"+
				 "3:Accept no and find out cube if no is divisble by \n"+
				 "4:Accept 3 nofrom user and find out the greatest");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				//input of choice 1
				System.out.println("Enter the number");
				num=sc.nextInt();
				//output of choice 1
				if(num%2==0)
				{
					System.out.println("It is even number");
				}
				else
				{
					System.out.println("It is odd number");
				}
				break;
			case 2:
				//input of choice 2
				System.out.println("Enter the marks of 5 subject");
				m1=sc.nextInt();
				m2=sc.nextInt();
				m3=sc.nextInt();
				m4=sc.nextInt();
				m5=sc.nextInt();
				total=m1+m2+m3+m4+m5;
				res=(total*10)/5;
				//output of choice 2
						if(res>90)
							{
							System.out.println("A grade");
							}
						else if(res>80 && res<90)
							{
							System.out.println("B grade");
							}
						else if(res>70 && res<80)
							{
							System.out.println("C grade");
							}
						else if(res>60 && res<70)
							{
							System.out.println("D grade");
							}
						else
							{
							System.out.println("Fail");
							}
						break;
			case 3:
					//input of choice 3
					System.out.println("Enter the number");
					num5=sc.nextInt();
					//output of choice 3
					if(num5%5==0)
						{
						System.out.println("The cube of Number is="+num5*num5*num5);
						}
					else
						{
						System.out.println("Number is not divisble by 5");
						}
					break;
			case 4:
				//taking input for 4 choice
				 	System.out.println("Enter the 1 Number");
				 	num1=sc.nextInt();
				 	System.out.println("Enter the 2 Number");
				 	num2=sc.nextInt();
				 	System.out.println("Enter the 3 Number");
				 	num3=sc.nextInt();
				 	//output of choice 4
				 	if(num1>num2 && num1>num3)
				 		{
				 		System.out.println("Number one is Greater");
				 		}
				 	else if(num2>num1 && num2>num3)
				 		{
				 		System.out.println("Number two is Greater");
				 		}
				 	else if(num3>num1 && num3>num2)
				 		{
				 		System.out.println("Number three is Greater");
				 		}
				 	break;
			default:
					System.out.println("Your enter invalid choice");
					break;
		}
	}
}
