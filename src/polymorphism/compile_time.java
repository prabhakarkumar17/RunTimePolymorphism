package polymorphism;

/* DYNAMIC METHOD DISPATCH or RUN TIME METHOD*/

class A		//SUPER_CLASS 
{
	public void m()
	{
		System.out.println("\n class A is here");
		
	}
}

class B extends A //Single inheritance
{
	public void m() //METHOD_OVERRIDDING
	{
		System.out.println("\n class B is here");
	}

}

public class compile_time //main class
{
	public static void main(String[] args) 
	{
		A obj=new A(); //object and reference of the same clss
		A obj2=new B(); // object of super class and reference of constructor of inherited class
		
		obj.m(); //it will call super class method
        obj2.m();//it will call inherited class method as reference is of inherited class
	}

}
