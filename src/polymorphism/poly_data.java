package polymorphism;

/* RUN TIME POLYMORPHISM OF DATA MEMBER*/

class C //super class
{
	int i=10; 
}

class D extends C //inherited class
{
	int i=20;
}

public class poly_data 
{
    public static void main(String[] args) 
	{
	 C obj1=new C();
	 C obj2=new D();
	 
	 System.out.println("value of i="+obj1.i);//here both output will be same as data cant be overridden
	 System.out.println("value of i="+obj2.i);
	}

}
