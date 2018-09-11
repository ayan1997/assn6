interface Animals
{
	void speak();
	void eat();
}
class Cat implements Animals
{
	public void speak()
	{
		System.out.println("Cat ");
	}
	public void eat()
	{
		System.out.println("Cat Drinks milk");
	}
}
class Dog implements Animals
{
	public void speak()
	{
		System.out.println("Dog barks");
	}
	public void eat()
	{
		System.out.println("Dog eats bone");
	}
}
public class Q1
{
	public static void main(String args[])
	{
		Cat c=new Cat();
		Dog d=new Dog();
		c.speak();
		c.eat();
		d.speak();
		d.eat();
	}
	
}
