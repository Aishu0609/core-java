class Ornament{
	String item;
	int rating;
	double cost;
	String Product;
	
	Ornament(){
	
		super();
		
			System.out.println("Ornament is Created");
	}
	Ornament(String item){
	
		super();
		
	
		this.item=item;
		System.out.println("Ornament item:"+item);
		
	}
	Ornament(String item,int rating){
	
		super();
		
		this.item=item;
		this.rating=rating;
		System.out.println("Ornament item:"+item);
		System.out.println("Ornament rating:"+rating);
	}
	Ornament(String item,int rating,double cost){
	
		super();
		
		this.item=item;
		this.rating=rating;
		this.cost=cost;
		System.out.println("Ornament item:"+item);
		System.out.println("Ornament rating:"+rating);
		System.out.println("Ornament cost:"+cost);
	}
	Ornament(String item,int rating,double cost,String Product){
	
		super();
		
		this.item=item;
		this.rating=rating;
		this.cost=cost;
		this.Product=Product;
		System.out.println("Ornament item:"+item);
		System.out.println("Ornament rating:"+rating);
		System.out.println("Ornament cost:"+cost);
		System.out.println("Ornament Product:"+Product);
		
	}
	
}
		
