class BakeryStarter{
	
	public static void main(String[] ethics){
		
		String name="Nandini";
		Bakery.setname(name);
		
		String[] biscuits={"Maska-Chaska","Moms magic","Oreo","Unibic","Monaco"};
		Bakery.setbiscuits(biscuits);
		
		long[] contact={9372819293L,8394028374L,8392932838L,8737281929L};
		Bakery.setcontact(contact);
		
		String[] machines={"Fridge","Oven","Heater","System"};
		Bakery.setmachines(machines);
		
		boolean locked=false;
		Bakery.setlocked(locked);
		Bakery.locking();
		
		String[] cakes={"Chocolate","Pastry","Apple","Blackcurrent"};
		Bakery.setcakes(cakes);
		
		String[] chocolates={"Dairymilk","5-star","Kit-Kat","Munch"};
		Bakery.setchocolates(chocolates);
		
		Bakery.displayInfo();
		
	}
}
	

