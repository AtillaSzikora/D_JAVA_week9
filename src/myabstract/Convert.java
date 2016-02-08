package myabstract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert
{
	public static void main(String[] args)
	{
		String[] strings = new String[] { "1", "2" };
		List<String> StringList = new ArrayList<String>(Arrays.asList(strings));
		System.out.println(StringList);
	}
}
