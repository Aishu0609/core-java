class Free{
	
	String why;
	boolean freeforAll;
	String what;
	
	Free(String why,boolean freeforAll,String what){
		this.why=why;
		this.freeforAll=freeforAll;
		this.what=what;
		System.out.println("Created Free with String,Boolean,String Constructor");
	}
	void displayInfo(){
		
		System.out.println("Starting displayInfo");
		System.out.println(this.why=why);
		System.out.println(this.freeforAll=freeforAll);
		System.out.println(this.what=what);
		
		
		System.out.println("Ending displayInfo");
		
	}
}
