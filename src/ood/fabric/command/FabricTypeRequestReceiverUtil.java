package ood.fabric.command;

public class FabricTypeRequestReceiverUtil {
	
	public static FabricTypeRequestReceiver getUnderlyingRequestSystem(){
		 String fabricName = System.getProperty("fabric.name");
		 System.out.println("Underlying fabric is:"+fabricName);
		 if(fabricName.contains("Woolen")){
			 return new WoolenFabricRequest();
		 }else{
			 return new CottonFabricRequest();
		 }
	}

}