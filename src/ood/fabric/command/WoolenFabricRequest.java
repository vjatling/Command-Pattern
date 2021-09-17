package ood.fabric.command;

public class WoolenFabricRequest implements FabricTypeRequestReceiver {

	@Override
	public void openRequest() {
		System.out.println("Receiving request for Woolen Fabric");
		
	}

	@Override
	public void verifyRequest() {
		System.out.println("Verifying request for Woolen Fabric");
	}

	@Override
	public void closeRequest() {
		System.out.println("Closing request for Woolen Fabric");
	}

}
