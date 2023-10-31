class MatchboxStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting main in KeyboardStarter");
		
		Matchbox Matchbox=new Matchbox();
		System.out.println("Matchbox brand is: "+Matchbox.brand);
		System.out.println("Matchbox noOfSticks is: "+Matchbox.noOfSticks);
		System.out.println("Matchbox length is: "+Matchbox.length);
		System.out.println("Matchbox price is: "+Matchbox.price);
		System.out.println("Matchbox weight is: "+Matchbox.weight);
		System.out.println("Matchbox type is: "+Matchbox.type);
		
		Matchbox Matchbox1=new Matchbox("Quenker Matches");
		System.out.println("Matchbox1 brand is: "+Matchbox1.brand);                                
		System.out.println("Matchbox1 noOfSticks is: "+Matchbox1.noOfSticks);
		System.out.println("Matchbox1 length is: "+Matchbox1.length);
		System.out.println("Matchbox1 price is: "+Matchbox1.price);
		System.out.println("Matchbox1 weight is: "+Matchbox1.weight);
		System.out.println("Matchbox1 type is: "+Matchbox1.type);
		
		Matchbox Matchbox2=new Matchbox("Asia Match",300);
		System.out.println("Matchbox2 brand is: "+Matchbox2.brand);                                
		System.out.println("Matchbox2 noOfSticks is: "+Matchbox2.noOfSticks);
		System.out.println("Matchbox2 length is: "+Matchbox2.length);
		System.out.println("Matchbox2 price is: "+Matchbox2.price);
		System.out.println("Matchbox2 weight is: "+Matchbox2.weight);
		System.out.println("Matchbox2 type is: "+Matchbox2.type);
		
		
		Matchbox Matchbox3=new Matchbox("Quick",203,30);
		System.out.println("Matchbox3 brand is: "+Matchbox3.brand);                                
		System.out.println("Matchbox3 noOfSticks is: "+Matchbox3.noOfSticks);
		System.out.println("Matchbox3 length is: "+Matchbox3.length);
		System.out.println("Matchbox3 price is: "+Matchbox3.price);
		System.out.println("Matchbox3 weight is: "+Matchbox3.weight);
		System.out.println("Matchbox3 type is: "+Matchbox3.type);
		
		
		Matchbox Matchbox4=new Matchbox("Hard",200,40,50);
		System.out.println("Matchbox4 brand is: "+Matchbox4.brand);                                
		System.out.println("Matchbox4 noOfSticks is: "+Matchbox4.noOfSticks);
		System.out.println("Matchbox4 length is: "+Matchbox4.length);
		System.out.println("Matchbox4 price is: "+Matchbox4.price);
		System.out.println("Matchbox4 weight is: "+Matchbox4.weight);
		System.out.println("Matchbox4 type is: "+Matchbox4.type);
		
		
		Matchbox Matchbox5=new Matchbox("Asus",200,30,60,10);
		System.out.println("Matchbox5 brand is: "+Matchbox5.brand);                                
		System.out.println("Matchbox5 noOfSticks is: "+Matchbox5.noOfSticks);
		System.out.println("Matchbox5 length is: "+Matchbox5.length);
		System.out.println("Matchbox5 price is: "+Matchbox5.price);
		System.out.println("Matchbox5 weight is: "+Matchbox5.weight);
		System.out.println("Matchbox5 type is: "+Matchbox5.type);
		
		Matchbox Matchbox6=new Matchbox("Asus",200,30,60,10,"Strong");
		System.out.println("Matchbox6 brand is: "+Matchbox6.brand);                                
		System.out.println("Matchbox6 noOfSticks is: "+Matchbox6.noOfSticks);
		System.out.println("Matchbox6 length is: "+Matchbox6.length);
		System.out.println("Matchbox6 price is: "+Matchbox6.price);
		System.out.println("Matchbox6 weight is: "+Matchbox6.weight);
		System.out.println("Matchbox6 type is: "+Matchbox6.type);
		
		
		
		
		System.out.println("Ending main in MainStarter");
	}
}