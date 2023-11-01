class BookMyShow{
	
	static boolean purchase(String movieName,int quantity){
		
		System.out.println("starting in BookMyShow");
		int ref=Theatre.provideTotal(movieName,quantity,250);
		System.out.println("total is :"+ref);
		
		if(movieName!=null){
			
			System.out.println("Ticket is confirmed");
			System.out.println("Ending in Theatre");
			return true;
		}
		else{
			System.out.println("Ticket is not confirmed");
			System.out.println("Ending in Theatre");
			return true;
		}
	}
}
			
			