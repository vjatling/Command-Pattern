package ood.fabric.command;

public class VerifyRequestCommand implements interfaceCommand {

	private FabricTypeRequestReceiver requestSystem;
	
	public VerifyRequestCommand(FabricTypeRequestReceiver fs){
		this.requestSystem=fs;
	}
	@Override
	public void execute() {
		this.requestSystem.verifyRequest();
	}
}
