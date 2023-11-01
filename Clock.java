class Clock{
	String brand;
	String design;
	String type;
	double cost;
	
	Clock(){
	
		super();
		
			System.out.println("Clock is Created");
	}
	Clock(String brand){
	
		super();
		
	
		this.brand=brand;
		System.out.println("Clock brand:"+brand);
		
	}
	Clock(String brand,String design){
	
		super();
		
		this.brand=brand;
		this.design=design;
		System.out.println("Clock brand:"+brand);
		System.out.println("Clock design:"+design);
	}
	Clock(String brand,String design,String type){
	
		super();
		
		this.brand=brand;
		this.design=design;
		this.type=type;
		System.out.println("Clock brand:"+brand);
		System.out.println("Clock design:"+design);
		System.out.println("Clock type:"+type);
	}
	Clock(String brand,String design,String type,double cost){
	
		super();
		
		this.brand=brand;
		this.design=design;
		this.type=type;
		this.cost=cost;
		System.out.println("Clock brand:"+brand);
		System.out.println("Clock design:"+design);
		System.out.println("Clock type:"+type);
		System.out.println("Clock cost:"+cost);
		
	}
	
}
		
