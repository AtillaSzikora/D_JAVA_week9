package pista;

public class Pista implements Autoszerelo, SzobaFesto
{
	@Override
	public boolean tudSzobatFesteni()
	{
		return false;
	}

	@Override
	public boolean tudAutotSzerelni()
	{
		return false;
	}
}