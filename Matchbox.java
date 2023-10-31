class Matchbox{
	String brand;
	int noOfSticks;
	int length;
	double price;
	int weight;
	String type;
	
	
	Matchbox()
	{
		System.out.println("Matchbox is Created");
	}
	Matchbox(String brand)
	{
		this.brand=brand;
		System.out.println("Matchbox brand:"+brand);
		
	}
	Matchbox(String brand,int noOfSticks)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		System.out.println("Matchbox brand:"+brand);
		System.out.println("Matchbox noOfKeys:"+noOfSticks);
	}
	Matchbox(String brand,int noOfSticks,int length)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		System.out.println("Matchbox brand:"+brand);
		System.out.println("Matchbox noOfSticks:"+noOfSticks);
		System.out.println("Matchbox length:"+length);
	}
	Matchbox(String brand,int noOfSticks,int length,double price)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		System.out.println("Matchbox brand:"+brand);
		System.out.println("Matchbox noOfSticks:"+noOfSticks);
		System.out.println("Matchbox length:"+length);
		System.out.println("Matchbox price:"+price);
		
	}
	Matchbox(String brand,int noOfKeys,int length,double price,int weight)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.weight=weight;
		System.out.println("Matchbox brand:"+brand);
		System.out.println("Matchbox noOfSticks:"+noOfSticks);
		System.out.println("Matchbox length:"+length);
		System.out.println("Matchbox price:"+price);
		System.out.println("Matchbox weight:"+weight);
	
	}
	Matchbox(String brand,int noOfKeys,int length,double price,int weight,String type)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
		this.price=price;
		this.weight=weight;
		this.type=type;
		System.out.println("Matchbox brand:"+brand);
		System.out.println("Matchbox noOfSticks:"+noOfSticks);
		System.out.println("Matchbox length:"+length);
		System.out.println("Matchbox price:"+price);
		System.out.println("Matchbox weight:"+weight);
		System.out.println("Matchbox type:"+type);
		
	
	}
	
}
		
