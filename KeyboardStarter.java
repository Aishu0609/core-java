class KeyboardStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting main in KeyboardStarter");
		
		Keyboard keyboard=new Keyboard();
		System.out.println("KeyBoard brand is: "+keyboard.brand);
		System.out.println("KeyBoard color is: "+keyboard.color);
		System.out.println("KeyBoard noOfKeys is: "+keyboard.noOfKeys);
		System.out.println("KeyBoard type is: "+keyboard.type);
		System.out.println("KeyBoard cost is: "+keyboard.cost);
		
		Keyboard keyboard1=new Keyboard("Logitech");
		System.out.println("KeyBoard1 brand is: "+keyboard1.brand);
		System.out.println("KeyBoard1 color is: "+keyboard1.color);
		System.out.println("KeyBoard1 noOfKeys is: "+keyboard1.noOfKeys);
		System.out.println("KeyBoard1 type is: "+keyboard1.type);
		System.out.println("KeyBoard1 cost is: "+keyboard1.cost);
		
		Keyboard keyboard2=new Keyboard("Dell",110);
		System.out.println("KeyBoard2 brand is: "+keyboard2.brand);
		System.out.println("KeyBoard2 color is: "+keyboard2.color);
		System.out.println("KeyBoard2 noOfKeys is: "+keyboard2.noOfKeys);
		System.out.println("KeyBoard2 type is: "+keyboard2.type);
		System.out.println("KeyBoard2 cost is: "+keyboard2.cost);
		
		Keyboard keyboard3=new Keyboard("Amazon Basics",104,"Red");
		System.out.println("KeyBoard3 brand is: "+keyboard3.brand);
		System.out.println("KeyBoard3 color is: "+keyboard3.color);
		System.out.println("KeyBoard3 noOfKeys is: "+keyboard3.noOfKeys);
		System.out.println("KeyBoard3 type is: "+keyboard3.type);
		System.out.println("KeyBoard3 cost is: "+keyboard3.cost);
		
		Keyboard keyboard4=new Keyboard("Lenovo",110,"Black","Unwired");
		System.out.println("KeyBoard4 brand is: "+keyboard4.brand);
		System.out.println("KeyBoard4 color is: "+keyboard4.color);
		System.out.println("KeyBoard4 noOfKeys is: "+keyboard4.noOfKeys);
		System.out.println("KeyBoard4 type is: "+keyboard4.type);
		System.out.println("KeyBoard4 cost is: "+keyboard4.cost);
		
		Keyboard keyboard5=new Keyboard("Asus",104,"Red","Unwired",1000.9);
		System.out.println("KeyBoard5 brand is: "+keyboard5.brand);
		System.out.println("KeyBoard5 color is: "+keyboard5.color);
		System.out.println("KeyBoard5 noOfKeys is: "+keyboard5.noOfKeys);
		System.out.println("KeyBoard5 type is: "+keyboard5.type);
		System.out.println("KeyBoard5 cost is: "+keyboard5.cost);
		
		System.out.println("Ending main in MainStarter");
	}
}