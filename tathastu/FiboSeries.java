class FiboSeries
{
	public void fib(int n)
	{
		int n1=0, n2=1, n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<n;++i)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		   
		}		
	}

	public static void main(String[] args) 
	{
		int n=10;
		FiboSeries f=new FiboSeries();
		f.fib(n);

	}
}