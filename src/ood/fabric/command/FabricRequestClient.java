package ood.fabric.command;

public class FabricRequestClient {

	public static void main(String[] args) {
		//Creating the receiver object
		FabricTypeRequestReceiver fs = getUnderlyingRequestSystem();
		
		//creating command and associating with receiver
		OpenRequestCommand openRequestCommand = new OpenRequestCommand();
		
		//Creating invoker and associating with Command
		RequestInvoker request = new RequestInvoker(openRequestCommand);
		
		//perform action on invoker object
		request.execute();
		
		VerifyRequestCommand verifyRequestCommand = new VerifyRequestCommand(fs);
		request = new RequestInvoker(verifyRequestCommand);
		request.execute();
		
		CloseRequestCommand closeRequestCommand = new CloseRequestCommand(fs);
		request = new RequestInvoker(closeRequestCommand);
		request.execute();
	}

	private static FabricTypeRequestReceiver getUnderlyingRequestSystem() {
		// TODO Auto-generated method stub
		return null;
	}


}
