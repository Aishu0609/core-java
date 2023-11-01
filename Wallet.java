class Wallet{
	String brand;
	String design;
	String type;
	double cost;
	
	Wallet(){
	
		super();
		
			System.out.println("Wallet is Created");
	}
	Wallet(String brand){
	
		super();
		
	
		this.brand=brand;
		System.out.println("Wallet brand:"+brand);
		
	}
	Wallet(String brand,String design){
	
		super();
		
		this.brand=brand;
		this.design=design;
		System.out.println("Wallet brand:"+brand);
		System.out.println("Wallet design:"+design);
	}
	Wallet(String brand,String design,String type){
	
		super();
		
		this.brand=brand;
		this.design=design;
		this.type=type;
		System.out.println("Wallet brand:"+brand);
		System.out.println("Wallet design:"+design);
		System.out.println("Wallet type:"+type);
	}
	Wallet(String brand,String design,String type,double cost){
	
		super();
		
		this.brand=brand;
		this.design=design;
		this.type=type;
		this.cost=cost;
		System.out.println("Wallet brand:"+brand);
		System.out.println("Wallet design:"+design);
		System.out.println("Wallet type:"+type);
		System.out.println("Wallet cost:"+cost);
		
	}
	
}
		
