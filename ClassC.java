package com.pack1;


public class ClassC 
{
void meth1(int a,int b)
{
	System.out.println(a);
	System.out.println(a+b);
    new ClassC().meth2("JAVA IS AWESOME");
    System.out.println(b);    
}
void meth2(String s)
{
	System.out.println(s);
}

	public static void main(String[]args)
	{
		
	new ClassC().meth1(45,5);
}
}
