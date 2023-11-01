class ClientStarter{
	
	public static void main(String[] buyer){
		System.out.println("Starting main ClientStarter");
		String online=Client.purchaseproduct("Divya","Television",11);
		System.out.println(online);
		online=Client.purchaseproduct("Shreyas","Fridge",25);
		System.out.println(online);
		online=Client.purchaseproduct("Shambu","Oven",35);
		System.out.println(online);
		online=Client.purchaseproduct("Geetha","Toaster",5);
		System.out.println(online);
		online=Client.purchaseproduct("Nithin","Mobile",32);
		System.out.println(online);
		System.out.println("Ending main ClientStarter");
	}
}