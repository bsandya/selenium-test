package Test;

import org.junit.validator.PublicClassValidator;

interface I
{
	void m1();
}
interface M
{
	void m2();
}
class A implements I,M
{
public void m1()
{
	System.out.println("A");
}
public void m2()
{
	System.out.println("B");
}
}
class inter
{
public static void main(String[] args)
{
I obj =new A();
obj.m1();
M opj =new A();
opj.m2();

}
}