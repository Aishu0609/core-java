class WalletStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting Wallet in WalletStarter");
		
		Wallet Wallet=new Wallet();
		System.out.println("Wallet brand is: "+Wallet.brand);
		System.out.println("Wallet design is: "+Wallet.design);
		System.out.println("Wallet type is: "+Wallet.type);
		System.out.println("Wallet cost is: "+Wallet.cost);
		
		Wallet Wallet1=new Wallet("Lorenz");
		System.out.println("Wallet1 brand is: "+Wallet1.brand);
		System.out.println("Wallet1 design is: "+Wallet1.design);
		System.out.println("Wallet1 type is: "+Wallet1.type);
		System.out.println("Wallet1 cost is: "+Wallet1.cost);
		
		Wallet Wallet2=new Wallet("UrbanForest","Printed");
		System.out.println("Wallet2 brand is: "+Wallet2.brand);
		System.out.println("Wallet2 design is: "+Wallet2.design);
		System.out.println("Wallet2 type is: "+Wallet2.type);
		System.out.println("Wallet2 cost is: "+Wallet2.cost);
		
		Wallet Wallet3=new Wallet("Napahide","Plain","Leather");
		System.out.println("Wallet3 brand is: "+Wallet3.brand);
		System.out.println("Wallet3 design is: "+Wallet3.design);
		System.out.println("Wallet3 type is: "+Wallet3.type);
		System.out.println("Wallet3 cost is: "+Wallet3.cost);
		
		Wallet Wallet4=new Wallet("Napahide","Plain","Leather",2000.0);
		System.out.println("Wallet4 brand is: "+Wallet.brand);
		System.out.println("Wallet4 design is: "+Wallet.design);
		System.out.println("Wallet4 type is: "+Wallet.type);
		System.out.println("Wallet4 cost is: "+Wallet.cost);
		
		System.out.println("Ending Wallet in WalletStarter");
	}
}