package whiledemo;
import java.util.Scanner;

public class primenumber {
	
	int a,b,c=1;
	Scanner cc = new Scanner(System.in);
	
	
	public void prime()
	{
		System.out.println("enter number");
		a=cc.nextInt();
		for(b=2;b<a/2;b++)
		{
		 if(a%b==0) 
		 c=0;	 
		}
		
		if(c==1)
		System.out.println("prime number");	
		else
			System.out.println(" not prime number");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primenumber aa= new primenumber();
		aa.prime();
		

	}

}
