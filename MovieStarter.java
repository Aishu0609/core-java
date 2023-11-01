class MovieStarter{
	
	public static void main(String[] show){
	
	System.out.println("starting main at MovieStarter");
	System.out.println("\n");
	
	Movie.buyTicket("Kushi",5);
	System.out.println("\n");
	Movie.buyTicket("Life is beautiful",10);
	System.out.println("\n");
	
	Movie.cancelTicket("Horror",15,25);
	System.out.println("\n");
	Movie.cancelTicket("Bunny",5,2);
	System.out.println("\n");
	
	
	Movie.bookTicket("Saaho","Telugu",4,true);
	System.out.println("\n");
	Movie.bookTicket("Darling","Telugu",5,false);
	System.out.println("\n");
	
	System.out.println("ending main at MovieStarter");
	}
}
	
	
	
	