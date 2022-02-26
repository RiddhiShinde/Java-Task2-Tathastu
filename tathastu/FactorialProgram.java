class FactorialProgram
{
	int fact(int n)
	{
		int fct=0;
		if (n==1 || fct==1)
			return 1;
		
		fct=n*fact(n-1);
		return fct;
	}

	public static void main(String[] args) 
	{
		int ans, n=5;
		FactorialProgram f=new FactorialProgram();
		ans=f.fact(n);
		System.out.println(ans);
	}
}