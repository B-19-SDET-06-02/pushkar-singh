package whiledemo;

public class fibnocci {
	
	public void fibnoccii() {
	int y=0,a=1,z;
	System.out.println(y);
	for(int i=1; i<10;i++)
	{
		z=y+a;
		a=y;
		y=z;
	
		System.out.println(z);
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fibnocci aa=new fibnocci();
     aa.fibnoccii();
	}

}
