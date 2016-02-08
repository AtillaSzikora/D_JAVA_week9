package pista;

import shape.Shape;

public class ShapeTest
{
	public static double calculateArea(Shape shape)
	{
		return shape.getArea();
	}

	public static void main(String[] args)
	{
		Autoszerelo szerelo = new Pista();
		SzobaFesto festo = new Pista();
		szerelo.tudAutotSzerelni();
		festo.tudSzobatFesteni();
	}
}
