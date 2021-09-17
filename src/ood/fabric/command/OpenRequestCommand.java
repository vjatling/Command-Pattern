package ood.fabric.command;

public class OpenRequestCommand implements interfaceCommand {

	private FabricTypeRequestReceiver requestSystem;
	
	public void OpenFileCommand(FabricTypeRequestReceiver fs){
		this.requestSystem=fs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openRequest method
		this.requestSystem.openRequest();
	}
	
}
