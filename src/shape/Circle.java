package shape;

public class Circle implements Shape
{
	double radius = Math.PI;

	@Override
	public double getArea()
	{
		return 0;
	}

	@Override
	public double getPerimeter()
	{
		return 0;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}
