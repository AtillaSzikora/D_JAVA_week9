package animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Human extends AbstractClass implements Eloleny
{
	enum Gender
	{
		MALE, FEMALE
	}

	Gender gender;
	String name;
	int age;
	double height;
	float weight;
	boolean hasPriuse;

	public Human(Gender gender, String name, int age, double height, float weight, boolean hasPriuse)
	{
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.hasPriuse = hasPriuse;
	}

	@Override
	public String toString()
	{
		return "Name:" + name + " Age:" + age + " Height:" + height;
	}

	public static void main(String[] args)
	{
		// Eloleny joli = new Human(Gender.FEMALE, "Kupak Joli", 40, 160, 60,
		// false);
		// System.out.println(joli);
		// Eloleny arpi = new Human(Gender.MALE, "Nagy Arpi", 35, 180, 110,
		// true);
		// System.out.println(arpi);
		// arpi.eat(null, 14);
		// System.out.println(arpi);
		// Human h = (Human) joli;
		// Animal kutya = new Animal();
		// Death death1 = new Death(joli);
		// Death death2 = new Death(kutya);
		// printName(joli);
		// int a = AbstractClass.Q;
		//
		// print();

		Human human1 = new Human(Gender.MALE, "Nagy Arpi", 25, 150, 110, true);
		Human human2 = new Human(Gender.MALE, "Szabo Arpi", 45, 180, 110, true);
		Human human3 = new Human(Gender.MALE, "Toth Arpi", 35, 180, 110, true);
		Human human4 = new Human(Gender.MALE, "Kovacs Arpi", 15, 200, 110, true);
		List<Human> humans = new ArrayList<Human>();
		humans.add(human1);
		humans.add(human2);
		humans.add(human3);
		humans.add(human4);
		humans.sort(new Comparator<Human>()
		{
			@Override
			public int compare(Human o1, Human o2)
			{
				if (o1.getHeight() < o2.getHeight())
				{
					return -1;
				}
				else if (o1.getHeight() > o2.getHeight())
				{
					return 1;
				}
				return 0;
			}
		});
		for (Human human : humans)
		{
			System.out.println(human);
		}
	}

	public static void printName(Eloleny e)
	{
		e.eat("", 50);
		// if (e instanceof Human)
		// {
		// Human ember = (Human) e;
		// System.out.println(ember.name);
		// }
	}

	@Override
	public void eat(String mit, int mennyit)
	{
		weight += mennyit;
	}

	@Override
	public void drink(String what)
	{

	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
}
