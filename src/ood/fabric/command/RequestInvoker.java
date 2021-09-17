package ood.fabric.command;

public class RequestInvoker {

	public interfaceCommand command;
	
	public RequestInvoker(interfaceCommand c){
		this.command=c;
	}
	
	public void execute(){
		this.command.execute();
	}

}
