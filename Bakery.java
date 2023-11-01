class Bakery{
	static String name;
	static String[] biscuits;
	static long[] contact;
	static String[] machines;
	static boolean locked;
	static String[] cakes;
	static String[] chocolates;
	
	static void setname(String name){
		
		Bakery.name=name;
	}
	static void setbiscuits(String[] biscuits){
		
		Bakery.biscuits=biscuits;
	}
	static void setcontact(long[] contact){
		
		Bakery.contact=contact;
	}
	static void setmachines(String[] machines){
		
		Bakery.machines=machines;
	}
	static void setlocked(boolean looked){
		
		Bakery.locked=locked;
	}
	static void setcakes(String[] cakes){
		
		Bakery.cakes=cakes;
	}
	static void setchocolates(String[] chocolates){
		
		Bakery.chocolates=chocolates;
	}
	
	static void locking(){
		System.out.println("displaying the locked");
		if (locked=true){
			
			
			System.out.println("Bakery is locked");
		}
		else
			System.out.println("Bakery is closed");
	}
	static void displayInfo(){
		
		System.out.println("Starting displaying bakery");
		
		System.out.println("name of bekary is:"+name);
		
		System.out.println("displaying the biscuits");
		
		for(int u=0;u<biscuits.length;u++){
			String ref=biscuits[u];
			System.out.println("biscuits of u"+u+" are"+ref);
			
		}
		System.out.println("displaying the contact");
		
		for(int u=0;u<contact.length;u++){
			long ref=contact[u];
			System.out.println("contact of u"+u+" are"+ref);
		}
		System.out.println("displaying the machines");
		
		for(int u=0;u<machines.length;u++){
			String ref=machines[u];
			System.out.println("machines of u"+u+" are"+ref);
		}
		
		
		System.out.println("displaying the cakes");
		
		for(int u=0;u<cakes.length;u++){
			String ref=cakes[u];
			System.out.println("cakes of u"+u+" are"+ref);
			
		}
		System.out.println("displaying the chocolates");
		
		for(int u=0;u<chocolates.length;u++){
			String ref=chocolates[u];
			System.out.println("chocolates of u"+u+" are"+ref);
			
		}
		System.out.println("Ending displaying Bakery");
		
	}
}
		
		
		
		
	
	