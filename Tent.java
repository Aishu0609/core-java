class Tent {
    
    int serialNumber;
    Color color;
    double width;
    double height;
   
	boolean open() {
        
            System.out.println("Tent is now open.");
            return true;
    }  
		
            
    boolean close() {
        
            System.out.println("Tent is now closed.");
            return false;
        
    }

    void showInfo(int serialNumber,Color color,double width,double height) {
		this.serialNumber=serialNumber;
		this.color=color;
		this.width=width;
		this.height=height;
        System.out.println("Starting showInfo in Tent");
		System.out.println("tent serialNumber is"+serialNumber);
	
		
		if(color!=null){
        System.out.println("tent Color is: " + color.Red);
		System.out.println("tent Color is: " + color.Black);
		System.out.println("tent Color is: " + color.Pink);
		}
        System.out.println("tent Width is: " + width);
        System.out.println("tent Height is: " + height);
        System.out.println("Ending showInfo in Tent");
		}
}

    

