import java.util.Scanner;
public class Calculator
{
	public static int add(int a,int b)
	{
		return a+b;		
	}
	public static int sub(int a,int b)
	{
		return a-b;		
	}
	public static int mul(int a,int b)
	{
		return a*b;		
	}
	public static float div(float a,float b)
	{
		return a/b;		
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int result,num1,num2;
		double res;
		int cntn=1;
		Calculator cal=new Calculator();
		while(cntn==1)
		{
			System.out.println("~~~~~~~~~~~CALCULATOR~~~~~~~~~~~");
			System.out.println("\n1 :ADDITION \n2 :SUBTRACTION\n3 :MULTIPLICATION\n4 :DIVSION\n5 : EXIT");
			System.out.println("Enter your choice :");
			int ch=scan.nextInt();
			switch(ch)
			{
				case 1: System.out.println("enter the first number :");
					num1=scan.nextInt();
					System.out.println("enter the second number :");
					num2=scan.nextInt();
					result=cal.add(num1,num2);
					System.out.println("the sum is "+result);
					break;
				case 2: System.out.println("enter the first number :");
					num1=scan.nextInt();
					System.out.println("enter the second number :");
					num2=scan.nextInt();
					result=cal.sub(num1,num2);		
					System.out.println("subtracted result is "+result);
					break;
				case 3: System.out.println("enter the first number :");
					num1=scan.nextInt();
					System.out.println("enter the second number :");
					num2=scan.nextInt();
					result=cal.mul(num1,num2);
					System.out.println("the multiplied reslt is "+result);
					break;
				case 4: System.out.println("enter the first number :");
					float num3=scan.nextInt();
					System.out.println("enter the second number :");
					float num4=scan.nextInt();
					res=cal.div(num3,num4);
					System.out.println("the divided result is "+res);
					break;
				case 5 :System.out.println("`````````THANKYOU`````````");
					cntn=0;
					break;
			}
		}
	}
}
	