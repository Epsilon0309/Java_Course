package ClassWork;

public interface MusicPlayer {

	void play();
	
	void pause();
	
	void stop();
	
}

class SpotifyPlayer implements MusicPlayer{
	
	@Override
	public void play() {
		System.out.println("Let's play Spotify");
	}
	
	@Override
	public void pause() {
		System.out.println("Let's pause Spotify");
	}
	
	@Override
	public void stop() {
		System.out.println("Let's stop Spotify");
	}
}

class YoutubeMusicPlayer implements MusicPlayer{
	
	@Override
	public void play() {
		System.out.println("Let's play Youtube Music");
	}
	
	@Override
	public void pause() {
		System.out.println("Let's pause Youtube Music");
	}
	
	@Override
	public void stop() {
		System.out.println("Let's stop Youtube Music");
	}
	
}
