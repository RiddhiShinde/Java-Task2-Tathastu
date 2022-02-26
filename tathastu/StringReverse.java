class StringReverse
{
	public static void main(String[] args) 
	{
		String s="reverse";
		String rs="";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rs= rs+ s.charAt(i);
		}

		System.out.println(rs);
	}
}