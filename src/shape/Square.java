package shape;

public class Square implements Shape
{
	double sideLength = 5.4;

	@Override
	public double getPerimeter()
	{
		return -1;
	}

	@Override
	public double getArea()
	{
		return -1;
	}

	public double getSideLength()
	{
		return sideLength;
	}

	public void setSideLength(double sideLength)
	{
		this.sideLength = sideLength;
	}
}
