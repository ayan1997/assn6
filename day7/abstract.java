import java.util.*;
import java.lang.*;

abstract class Animals
{
	String color,breed,name;
	abstract void eat();
	void speak(){}
}
class Cat extends Animals
{
	void eat()
	{
		System.out.println("Cat drinks milk");
	}
	void speak()
	{
		System.out.println("Cat meows");

	}
}
class Dog extends Animals
{
	void eat()
	{
		System.out.println("Dog eats bone");
	}
	void speak()
	{
		System.out.println("Dog barks");

	}
}
public class Q2
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
