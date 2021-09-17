package ood.fabric.command;

public class CottonFabricRequest implements FabricTypeRequestReceiver {

	@Override
	public void openRequest() {
		System.out.println("Receiving request for Cotton Fabric");
	}

	@Override
	public void verifyRequest() {
		System.out.println("Verifying request for Cotton Fabric");
	}

	@Override
	public void closeRequest() {
		System.out.println("Closing request for Cotton Fabric");
	}

}
