interface interface1
{
	int type =1 ;
	void method1();
	String method2();
}
class class1 implements interface1
{
	
  public void method1()
  {
	  System.out.println("this is method1 implementation in class1");
  }
  
  public String method2()
  {
	  return "This is method 2 in class1";
  }
}
public class inheritance2_interfaces {
	public static void main(String[] args)
	{
		class1 a = new class1();
		System.out.println(a.type);
		a.method1();
		System.out.println(a.method2());
		interface1 b = new class1();
		System.out.println(b.type);
		b.method1();
		System.out.println(b.method2());
		a =(class1) b;
	}

}
