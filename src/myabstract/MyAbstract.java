package myabstract;

public abstract class MyAbstract
{
	public void printMessage()
	{
		System.out.println(getMessage());
	}

	public abstract String getMessage();
}
