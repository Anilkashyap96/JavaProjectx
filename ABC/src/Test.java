class P
{
	public void m1()
	{
		System.out.println("Parent");
	}
}
class C extends P
{
	public void m1()
	{
		System.out.println("child");
	}
}
class Test
{
	public static void main(String[] arg)
	{
		P p=new P();
		p.m1();
		C c=new C();
		c.m1();
		P p1=new C();
		p1.m1();
	}
}