package org.example.codes;

public class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		Demo d=new Demo();
		Demo2 d2=new Demo2();
		d.demo();
		d2.demo();
	}
}
class Demo
{
	public void demo()
	{
		System.out.println("Demo");
	}
}
class Demo2
{
	public void demo()
	{
		System.out.println("Demo2");
	}
}
