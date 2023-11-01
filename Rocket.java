class Rocket{
	String name;
	String design;
	int time;
	boolean direction;
	
	Rocket(){
	
		super();
		
			System.out.println("Rocket is Created");
	}
	Rocket(String name){
	
		super();
		
	
		this.name=name;
		System.out.println("Rocket name:"+name);
		
	}
	Rocket(String name,String design){
	
		super();
		
		this.name=name;
		this.design=design;
		System.out.println("Rocket name:"+name);
		System.out.println("Clock design:"+design);
	}
	Rocket(String name,String design,int time){
	
		super();
		
		this.name=name;
		this.design=design;
		this.time=time;
		System.out.println("Rocket name:"+name);
		System.out.println("Rocket design:"+design);
		System.out.println("Rocket time:"+time);
	}
	Rocket(String name,String design,int time,boolean direction){
	
		super();
		
		this.name=name;
		this.design=design;
		this.time=time;
		this.direction=direction;
		System.out.println("Rocket name:"+name);
		System.out.println("Rocket design:"+design);
		System.out.println("Rocket time:"+time);
		System.out.println("Rocket direction:"+direction);
		
	}
	
}
		
