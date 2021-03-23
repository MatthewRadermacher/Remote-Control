public class TVUpCommand implements Command {
	TV tv;
 
	public TVUpCommand(TV tv) {
		this.tv = tv;
	}
 
	public void execute() {
		tv.incrementChannel();
	}
}