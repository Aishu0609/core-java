class Printer{
	
	String brand;
	String type;
	double noofsheets;
	double cost;
	String warranty;
	
	Printer(){
		this("Epson","Ink",200,2000,"1");
	
		
		
		System.out.println("Printer is Created");
	}
	Printer(String brand){
	
		this.brand=brand;
		System.out.println("Printer brand:"+brand);
		
	}
	Printer(String brand,String type){
	
		this.brand=brand;
		this.type=type;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
	}
	Printer(String brand,String type,double noOfPages){
	
	
		this.brand=brand;
		this.type=type;
		this.noofsheets=noofsheets;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
		System.out.println("Printer noofsheets:"+noofsheets);
	}
	Printer(String brand,String type,double noofsheets,double cost){
	
	
		this.brand=brand;
		this.type=type;
		this.noofsheets=noofsheets;
		this.cost=cost;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
		System.out.println("Printer noofsheets:"+noofsheets);
		System.out.println("Printer cost:"+cost);
		
	}
	Printer(String brand,String type,double noofsheets,double cost,String warranty){
	
		
		this.brand=brand;
		this.type=type;
		this.noofsheets=noofsheets;
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
		System.out.println("Printer noofsheets:"+noofsheets);
		System.out.println("Printer cost:"+cost);
		System.out.println("Printer warranty:"+warranty);
	
    }
}