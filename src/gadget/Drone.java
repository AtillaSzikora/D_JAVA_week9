package gadget;

public class Drone implements Gadget
{
	boolean turnedOn = true;
	double maximumDistance = 100.0;
	double maximumHeight = 50.0;

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

	public double getMaximumDistance()
	{
		return maximumDistance;
	}

	public void setMaximumDistance(double maximumDistance)
	{
		this.maximumDistance = maximumDistance;
	}

	public double getMaximumHeight()
	{
		return maximumHeight;
	}

	public void setMaximumHeight(double maximumHeight)
	{
		this.maximumHeight = maximumHeight;
	}

	@Override
	public String toString()
	{
		return "Drone " + turnedOn + " " + maximumDistance;
	}
}