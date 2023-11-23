class Application {
    
    int id;
	String name;
    ApplicationType type;
    double version;
    String developer;
    String date;

    
    Application(int id, String name, ApplicationType type, double version, String developer, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.version = version;
        this.developer = developer;
        this.date = date;
    }
	System.out.println("Application id is:"+this.id);
	System.out.println("Application name is:"+this.name);
	System.out.println("Application type is:"+this.type);
	System.out.println("Application version is:"+this.version);
	System.out.println("Application developer is:"+this.developer);
	System.out.println("Application date is:"+this.date);
	run();
	stop();
	execute();
	collectInfo();
	displayInfo();

   

    void run() {
        System.out.println("Running the application");
    }

    
    void execute() {
        System.out.println("Executing the application");
    }

    
    void stop() {
        System.out.println("Stopping the application");
    }

    
	void collectInfo() {
        System.out.println("Collecting information for the application");

    
    void displayInfo() {
        System.out.println("Displaying information for the application");
        
        
    }
}




