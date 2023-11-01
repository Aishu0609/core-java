class Movie{
	static void buyTicket(String movieName,int quantity){
		
		System.out.println("Starting of buyTicket");
		System.out.println("Movie Name is: "+movieName);
		System.out.println("quantity is :"+quantity);
		
		if(quantity>0 && quantity<10){
			System.out.println("Quantity is valid");
		}
		else{
			System.out.println("Quantity is invalid");
		}
		System.out.println("Ending of buyTicket");
	}
	static void cancelTicket(String movieName,int quantity,double charges){
		System.out.println("Starting of cancelTicket");
		System.out.println("Movie Name is:"+movieName);
		System.out.println("quantity is:"+quantity);
		System.out.println("charges is:"+charges);
		
		if(quantity>0 && quantity<10){
			System.out.println("quantity is valid");
		}
		else{
			System.out.println("quantity is invalid");
		}
		if(charges>0 && charges<5){
			System.out.println("charges is valid");
		}
		else{
			System.out.println("charges is invalid");
		}
			
		System.out.println("Ending of cancelTicket");
	}

	static void bookTicket(String movieName,String lang,int total,boolean anyCoupoun){
		System.out.println("Starting of bookTicket");
		System.out.println("Movie Name is:"+movieName);
		System.out.println("lang is:"+lang);
		System.out.println("total is:"+total);
		System.out.println("anyCoupoun is:"+anyCoupoun);
		
		if(total>0 && total<10){
			System.out.println("total is valid");
		}
		else{
			System.out.println("total is invalid");
		}
		if(anyCoupoun==true){
			System.out.println("coupoun is valid");
		}
		else{
			System.out.println("coupoun is invalid");
		}
			
		System.out.println("Ending of bookTicket");
	}
}


