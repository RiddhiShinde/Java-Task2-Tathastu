class calctr{


public static void main(String args[])
{

	int a=10;
	int b=20,c;
	char op='+';

	switch (op)
	{
		case '+': c=a+b;
				System.out.println("addition is: "+c);

		case '*': c=a*b;
				System.out.println("multi is: "+c);	

		case '/': c=a/b;
				System.out.println("division is: "+c);	

		case '-': c=a-b;
					System.out.println("substraction is: "+c);

		default : System.out.println("enter valid option");			

	}

}
}