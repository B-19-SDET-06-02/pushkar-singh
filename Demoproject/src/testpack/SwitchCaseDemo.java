package testpack;
import java.util.Scanner;

public class SwitchCaseDemo {
	int num1, num2, res, choice;
	Scanner sc = new Scanner(System.in);
public void enter()
{
	System.out.println("enter value 1");
	num1=sc.nextInt();
	
	System.out.println("enter value 2");
	num2=sc.nextInt();
	
}

public void check()
{
	System.out.println("1.Add\t\t2.Subtract\t3.Multiple\t4.Diide");
	System.out.println("enter your choice");
	choice=sc.nextInt();
 
	switch(choice)
	{
	case 1:
		enter();
		res=num1+num2;
		System.out.println("sum = "+res);
	case 2:
		enter();
		res=num1-num2;
		System.out.println("diff = "+res);
	default:
		System.out.println("choice doesn't exist");
	}
		
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCaseDemo tt = new SwitchCaseDemo();
		tt.check();

	}

}
