package whiledemo;

public class primeseries {
	
	int a,b,p=0;
	
	public void primes()
{
		
		
	for(a=2;a<100;a++){	
	for(b=2;b<a;b++)
	{
		if(a%b==0)
			{
			p=1;
			}
			
		
	} 
	if(p==0)
	{
		System.out.println(b);
	}
	p=0;
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		primeseries aa=new primeseries();
		aa.primes();

	}
}
