package Java;
//First Interface
public interface camera {
	void takePhoto();
}

//Second Interface
interface MusicPlayer {
 void playMusic();
}

//Class implementing both interfaces
class SmartPhone implements camera, MusicPlayer {
 public void takePhoto() {
     System.out.println("Taking a photo...");
 }

 public void playMusic() {
     System.out.println("Playing music...");
 }
}
