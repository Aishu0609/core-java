class OrnamentStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting Ornament in OrnamentStarter");
		
		Ornament Ornament=new Ornament();
		System.out.println("Ornament item is: "+Ornament.item);
		System.out.println("Ornament rating is: "+Ornament.rating);
		System.out.println("Ornament cost is: "+Ornament.cost);
		System.out.println("Ornament Product is: "+Ornament.Product);
		
		Ornament Ornament1=new Ornament("Chain");
		System.out.println("Ornament1 item is: "+Ornament1.item);
		System.out.println("Ornament1 rating is: "+Ornament1.rating);
		System.out.println("Ornament1 cost is: "+Ornament1.cost);
		System.out.println("Ornament1 Product is: "+Ornament1.Product);
		
		Ornament Ornament2=new Ornament("Ring",5);
		System.out.println("Ornament2 item is: "+Ornament2.item);
		System.out.println("Ornament2 rating is: "+Ornament2.rating);
		System.out.println("Ornament2 cost is: "+Ornament2.cost);
		System.out.println("Ornament2 Product is: "+Ornament2.Product);
		
		Ornament Ornament3=new Ornament("Anklet",4,1000);
		System.out.println("Ornament3 item is: "+Ornament3.item);
		System.out.println("Ornament3 rating is: "+Ornament3.rating);
		System.out.println("Ornament3 cost is: "+Ornament3.cost);
		System.out.println("Ornament3 Product is: "+Ornament3.Product);
		
		Ornament Ornament4=new Ornament("Nosepin",5,2000,"Gold");
		System.out.println("Ornament4 item is: "+Ornament4.item);
		System.out.println("Ornament4 rating is: "+Ornament4.rating);
		System.out.println("Ornament4 cost is: "+Ornament4.cost);
		System.out.println("Ornament4 Product is: "+Ornament4.Product);
		
		System.out.println("Ending Ornament in OrnamentStarter");
	}
}