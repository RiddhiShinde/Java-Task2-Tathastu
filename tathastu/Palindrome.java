class Palindrome
{
	public static void main(String[] args) 
	{
		String str="radar";
		String reversestr="";
		int len= str.length();
		for(int i=len-1;i>=0;--i)
			reversestr = reversestr+str.charAt(i);

		if(str.toLowerCase().equals(reversestr.toLowerCase()))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}