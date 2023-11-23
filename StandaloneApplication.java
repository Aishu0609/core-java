class StandaloneApplication extends Application{
    int size;
	String compatabilewith;
	Os os;	

    
    StandaloneApplication(String name,AppType type) {
        super(name.type);
        System.out.println("Created String ,AppType arg const in StandaloneApplication");
    }
	
	void showing(int size,String compatabilewith,Os os){
		this.size=size;
		this.compatabilewith=compatabilewith;
		this.Os=os;	

		System.out.println("Application size is:"+this.size);
		System.out.println("Application compatabilewith is:"+this.compatabilewith);
		System.out.println("Application Os is:"+this.Os);	
	
	consumeMemory();
	consumeInterner();
	}
	
	void consumeMemory() {
        System.out.println("Consuming memory for StandaloneApplication...");
    }
}