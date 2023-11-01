class MakeupKitStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting MakeupKit in MakeupKitStarter");
		
		MakeupKit MakeupKit=new MakeupKit();
		System.out.println("MakeupKit itemnames is: "+MakeupKit.itemnames);
		System.out.println("MakeupKit rating is: "+MakeupKit.rating);
		System.out.println("MakeupKit cost is: "+MakeupKit.cost);
		System.out.println("MakeupKit noOfProducts is: "+MakeupKit.noOfProducts);
		
		MakeupKit MakeupKit1=new MakeupKit("Lipstick");
		System.out.println("MakeupKit1 itemnames is: "+MakeupKit1.itemnames);
		System.out.println("MakeupKit1 rating is: "+MakeupKit1.rating);
		System.out.println("MakeupKit1 cost is: "+MakeupKit1.cost);
		System.out.println("MakeupKit1 noOfProducts is: "+MakeupKit1.noOfProducts);
		
		MakeupKit MakeupKit2=new MakeupKit("Compact",4);
		System.out.println("MakeupKit2 itemnames is: "+MakeupKit2.itemnames);
		System.out.println("MakeupKit2 rating is: "+MakeupKit2.rating);
		System.out.println("MakeupKit2 cost is: "+MakeupKit2.cost);
		System.out.println("MakeupKit2 noOfProducts is: "+MakeupKit2.noOfProducts);
		
		MakeupKit MakeupKit3=new MakeupKit("Eyeliner",4,500);
		System.out.println("MakeupKit3 itemnames is: "+MakeupKit3.itemnames);
		System.out.println("MakeupKit3 rating is: "+MakeupKit3.rating);
		System.out.println("MakeupKit3 cost is: "+MakeupKit3.cost);
		System.out.println("MakeupKit3 noOfProducts is: "+MakeupKit3.noOfProducts);
		
		MakeupKit MakeupKit4=new MakeupKit("Lashes",5,1000,40);
		System.out.println("MakeupKit4 itemnames is: "+MakeupKit4.itemnames);
		System.out.println("MakeupKit4 rating is: "+MakeupKit4.rating);
		System.out.println("MakeupKit4 cost is: "+MakeupKit4.cost);
		System.out.println("MakeupKit4 noOfProducts is: "+MakeupKit4.noOfProducts);
		
		System.out.println("Ending MakeupKit in MakeupKitStarter");
	}
}