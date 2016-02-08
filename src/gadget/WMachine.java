package gadget;

public class WMachine implements Gadget
{
	boolean turnedOn = true;
	boolean hasGUI = true;

	enum Category
	{
		AAA, AA, A, B, C, D, E, F
	};

	Category category = Category.AAA;

	@Override
	public boolean isTurnableOff()
	{
		return true;
	}

	@Override
	public void turnOff()
	{
		turnedOn = false;
	}

	public boolean isTurnedOn()
	{
		return turnedOn;
	}

	public void setTurnedOn(boolean turnedOn)
	{
		this.turnedOn = turnedOn;
	}

	@Override
	public String toString()
	{
		return getClass().getName() + " " + hasGUI + " " + category;
	}

	public boolean isHasGUI()
	{
		return hasGUI;
	}

	public void setHasGUI(boolean hasGUI)
	{
		this.hasGUI = hasGUI;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}
}
