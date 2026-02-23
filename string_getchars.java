class string_getchars
{
	public static void main(String args[])
{
	String s=" this is a demo of the getchars method ";
	int start=10,end=14;
	char buff[]=new char[end-start];
	s.getChars(start,end,buff,0);
	System.out.println(buff);
}
}