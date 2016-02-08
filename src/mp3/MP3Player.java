package mp3;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MP3Player extends Application
{
	private static final String MEDIA_URL = "file:///d:/drumroll.wav";
	private MediaPlayer mediaPlayer; // IT HAS TO BE A MEMBER VARIABLE, BECAUSE
										// GC CLEANS AFTER A FEW SECONDS IF IT
										// IS DECLARED IN start() METHOD !!!

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Media media = new Media(MEDIA_URL);
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.play();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}