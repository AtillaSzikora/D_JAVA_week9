package mp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		File file = new File("D:/");
		String extension = "mp3";
		try
		{
			DirectoryScanner ds = new DirectoryScanner(file, extension);
			List<File> mp3Files = ds.getMP3Files();
			for (File mp3File : mp3Files)
			{
				ID3Tag tag = ID3Tag.parse(mp3File);
				System.out.println(tag);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (NotDirectoryException e)
		{
			e.printStackTrace();
		}
	}
}