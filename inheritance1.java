// this will return when casting 
class method1
{
	// variables 
	int a = 10;
	String b = "Hello";
	
	// methods
	
	public void methoda()
	{
		System.out.println("this is method A in class1");
	}
	public void methodb()
	{
		System.out.println("This is method B in class 1");
	}
}

class  method2 extends method1
{
	public void methodnew()
	{
		System.out.println("this is new method in class 2");
		methoda();
	}
	@Override
	public void methoda()
	{
		System.out.println("This is a override method of A in class 2");
	}
	
}
public class inheritance1 {
public static void main(String[] args)
{
/*method1 mainmethod = new method1();

System.out.println(mainmethod.b);

method1 mainmethod1 = new method2();

mainmethod1.methoda();


//method2 b = (method2)new method1();

//b.methoda();
*/
method1 nm1;
method2 nm2;
nm1 = new method1();
nm2 = new method2();
nm1= nm2;
//System.out.println(nm1.a);
//nm1.methoda();
nm2 = (method2)nm1;
nm2.methoda();
}
}
