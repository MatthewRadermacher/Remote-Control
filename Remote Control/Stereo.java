public class Stereo {
	String location;
	int volume = 0;
	boolean on = false;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		on = true;
		System.out.println(location + " stereo is on");
	}

	public void off() {
		on = false;
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	//setVolume will always round the input volume to the closest value in the range 0-11
	public void setVolume(int volume) {
		if (!on) {
			System.out.println(location + " stereo is off");
			return;
		}
		if (volume < 0)
			volume = 0;
		else if (volume > 11)
			volume = 11;
		this.volume = volume;
		System.out.println(location + " Stereo volume set to " + volume);
	}
	
	//uses setVolume to stay in range
	public void incrementVolume() {
		setVolume(++volume);
	}
	
	//uses setVolume to stay in range
	public void decrementVolume() {
		setVolume(--volume);
	}
}
