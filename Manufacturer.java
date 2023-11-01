class Manufacturer{
	
	
	static int getDiscount(String product,int quantity){
		System.out.println("Starting Manufacturer");
		if(quantity>=1 && quantity<=50){
			if(product=="Television"){
				System.out.println("Product of Television");
				if(quantity>10){
					System.out.println("Discount is 5% ");
				}
			}
			else if(product=="Fridge"){
				System.out.println("Product of Fridge");
				if(quantity>20){
					System.out.println("Discount of 10%");
				}
			}
			else if(product=="Toaster"){
				System.out.println("Product of Toaster");
			}
			else if(product=="Oven"){
				System.out.println("Product of Oven");
				if(quantity>30){
					System.out.println("Discount of 15%");
				}
			}
			else if(product=="Mobile"){
				System.out.println("Product of Mobile");
				if(quantity>30){
					System.out.println("Discount of Mobile");
				}
			}
			else{
				System.out.println("Please choose available product");
			}
				
				return quantity;
			}
		
			return 0;
	}
		
}
	