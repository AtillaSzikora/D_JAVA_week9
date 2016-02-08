package animal;

public class Death
{
	Eloleny target;

	public Death(Eloleny target)
	{
		this.target = target;
	}

	public Eloleny getTarget()
	{
		return target;
	}

	public void setTarget(Eloleny target)
	{
		this.target = target;
	}

	public void kill()
	{
		if (target instanceof Animal)
		{
			Animal a = (Animal) target;
			a.setWeight(a.getWeight() * 0.9f);
		}
	}
}
