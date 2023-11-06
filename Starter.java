class Starter{
	public static void main(String[] args){
		
		System.out.println("Starting main in Starter");
		Color color=Color.Red;
		Tent tent=new Tent();
		Agent agent=new Agent();
		tent.showInfo(23,color,40,45);
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		System.out.println("Ending main in Starter");
	}
}
		

		