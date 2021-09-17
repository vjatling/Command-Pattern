package ood.fabric.command;

public class CloseRequestCommand implements interfaceCommand {

	private FabricTypeRequestReceiver requestSystem;
	
	public CloseRequestCommand(FabricTypeRequestReceiver fs){
		this.requestSystem=fs;
	}
	@Override
	public void execute() {
		this.requestSystem.closeRequest();
	}

}
