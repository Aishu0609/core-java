class TheatreStarter{
	public static void main(String[] values){
		
		System.out.println("Starting main TheatreStarter");
		String persons=Persons.bookTicket(null,0);
		System.out.println(persons);
		
		persons=Persons.bookTicket("SSE",5);
		System.out.println(persons);
		System.out.println("Ending main TheatreStarter");
	}
}