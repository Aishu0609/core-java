class Persons{
	static String bookTicket(String movieName,int quantity){
		System.out.println("Starting in Persons");
		
		boolean book=BookMyShow.purchase(movieName,quantity);
		
		if(movieName!=null){
			System.out.println("movieName is :"+movieName);
		}
		else{
			System.out.println("Provide movie name");
		}
		if(quantity<1){
			System.out.println("select seats");
		}
		else{
			System.out.println("quantity is:"+quantity);
		}
		
	if(movieName!=null && quantity>1){
		System.out.println("Booking Done");
	}
	else{
		System.out.println("Booking failed");
	}
	System.out.println("Ending in Persons");
	return null;
	}
}