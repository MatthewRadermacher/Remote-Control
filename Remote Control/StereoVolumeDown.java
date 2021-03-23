public class StereoVolumeDown implements Command {
	Stereo stereo;
 
	public StereoVolumeDown(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.decrementVolume();
	}
}