class MakeupKit{
	String itemnames;
	int rating;
	double cost;
	int noOfProducts;
	
	MakeupKit(){
	
		super();
		
			System.out.println("MakeupKit is Created");
	}
	MakeupKit(String itemnames){
	
		super();
		
	
		this.itemnames=itemnames;
		System.out.println("MakeupKit itemnames:"+itemnames);
		
	}
	MakeupKit(String itemnames,int rating){
	
		super();
		
		this.itemnames=itemnames;
		this.rating=rating;
		System.out.println("MakeupKit itemnames:"+itemnames);
		System.out.println("MakeupKit rating:"+rating);
	}
	MakeupKit(String itemnames,int rating,double cost){
	
		super();
		
		this.itemnames=itemnames;
		this.rating=rating;
		this.cost=cost;
		System.out.println("MakeupKit itemnames:"+itemnames);
		System.out.println("MakeupKit rating:"+rating);
		System.out.println("MakeupKit cost:"+cost);
	}
	MakeupKit(String itemnames,int rating,double cost,int noOfProduct){
	
		super();
		
		this.itemnames=itemnames;
		this.rating=rating;
		this.cost=cost;
		this.noOfProducts=noOfProducts;
		System.out.println("MakeupKit itemnames:"+itemnames);
		System.out.println("MakeupKit rating:"+rating);
		System.out.println("MakeupKit cost:"+cost);
		System.out.println("MakeupKit noOfProduct:"+noOfProduct);
		
	}
	
}
		
