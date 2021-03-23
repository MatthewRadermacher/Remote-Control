public class StereoVolumeUp implements Command {
	Stereo stereo;
 
	public StereoVolumeUp(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.incrementVolume();
	}
}