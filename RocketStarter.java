class RocketStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting Rocket in RocketStarter");
		
		Rocket Rocket=new Rocket();
		System.out.println("Rocket name is: "+Rocket.name);
		System.out.println("Rocket design is: "+Rocket.design);
		System.out.println("Rocket time is: "+Rocket.time);
		System.out.println("Rocket direction is: "+Rocket.direction);
		
		Rocket Rocket1=new Rocket("Atlas V");
		System.out.println("Rocket1 name is: "+Rocket1.name);
		System.out.println("Rocket1 design is: "+Rocket1.design);
		System.out.println("Rocket1 time is: "+Rocket1.time);
		System.out.println("Rocket1 direction is: "+Rocket1.direction);
		
		Rocket Rocket2=new Rocket("Atlas V","Sharper");
		System.out.println("Rocket2 name is: "+Rocket2.name);
		System.out.println("Rocket2 design is: "+Rocket2.design);
		System.out.println("Rocket2 time is: "+Rocket2.time);
		System.out.println("Rocket2 direction is: "+Rocket2.direction);
		
		Rocket Rocket3=new Rocket("Atlas V","Sharper",3);
		System.out.println("Rocket3 name is: "+Rocket3.name);
		System.out.println("Rocket3 design is: "+Rocket3.design);
		System.out.println("Rocket3 time is: "+Rocket3.time);
		System.out.println("Rocket3 direction is: "+Rocket3.direction);
		
		Rocket Rocket4=new Rocket("Atlas V","Sharper",3,true);
		System.out.println("Rocket4 name is: "+Rocket4.name);
		System.out.println("Rocket4 design is: "+Rocket4.design);
		System.out.println("Rocket4 time is: "+Rocket4.time);
		System.out.println("Rocket4 direction is: "+Rocket4.direction);
		
		System.out.println("Ending Clock in ClockStarter");
	}
}