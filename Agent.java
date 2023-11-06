class Agent {
    
    int id=24;
    String name="Vasu";
    String company="Flipkart";
    
    void openTent(Tent tent) {
        System.out.println("Starting openTent in Agent");
        System.out.println(tent.open());
		System.out.println(tent.serialNumber);
		System.out.println(tent.color);
		System.out.println(tent.width);
		System.out.println(tent.height);
		System.out.println("Ending openTent in Agent");
    }

    
    void closeTent(Tent tent) {
        System.out.println("Starting closeTent in Agent");
        System.out.println(tent.close());
		System.out.println(tent.serialNumber);
		System.out.println(tent.color);
		System.out.println(tent.width);
		System.out.println(tent.height);
		System.out.println("Ending closeTent in Agent");
        
    }

    
    void showInfo() {
		System.out.println("Starting showInfo in Agent"); 
        System.out.println("Agent ID: " + id);
        System.out.println("Agent Name: " + name);
        System.out.println("Agent Company: " + company);
		System.out.println("Ending showInfo in Agent"); 
    }

}
