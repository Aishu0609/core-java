class Keyboard{
	String brand;
	int noOfKeys;
	String color="Red";
	String type="nonwired";
	double cost=1000.9;
	
	Keyboard()
	{
		System.out.println("Keyboard is Created");
	}
	Keyboard(String brand)
	{
		this.brand=brand;
		System.out.println("Keyboard brand:"+brand);
		
	}
	Keyboard(String brand,int noOfKeys)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		System.out.println("Keyboard brand:"+brand);
		System.out.println("Keyboard noOfKeys:"+noOfKeys);
	}
	Keyboard(String brand,int noOfKeys,String color)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.color=color;
		System.out.println("Keyboard brand:"+brand);
		System.out.println("Keyboard noOfKeys:"+noOfKeys);
		System.out.println("Keyboard color:"+color);
	}
	Keyboard(String brand,int noOfKeys,String color,String type)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.color=color;
		this.type=type;
		System.out.println("Keyboard brand:"+brand);
		System.out.println("Keyboard noOfKeys:"+noOfKeys);
		System.out.println("Keyboard color:"+color);
		System.out.println("Keyboard type:"+type);
		
	}
	Keyboard(String brand,int noOfKeys,String color,String type,double cost)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.color=color;
		this.type=type;
		this.cost=cost;
		System.out.println("Keyboard brand:"+brand);
		System.out.println("Keyboard noOfKeys:"+noOfKeys);
		System.out.println("Keyboard color:"+color);
		System.out.println("Keyboard type:"+type);
		System.out.println("Keyboard cost:"+cost);
	
		
	}
}
		
