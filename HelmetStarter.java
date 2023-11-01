class HelmetStarter{

    public static void main(String[] args){

        System.out.println("Staring in HelmetStarter");

        Helmet Helmet=new Helmet();
        System.out.println("Helmet types is: "+Helmet.types);
        System.out.println("Helmet use is: "+Helmet.use);
        System.out.println("Helmet rating is: "+Helmet.rating);
        System.out.println("Helmet cost is: "+Helmet.cost);
        System.out.println("Helmet shape is: "+Helmet.shape);

        Helmet Helmet1=new Helmet("Halfhelmet");
        System.out.println("Helmet1 types is: "+Helmet1.types);
        System.out.println("Helmet1 use is: "+Helmet1.use);
        System.out.println("Helmet1 rating is: "+Helmet1.rating);
        System.out.println("Helmet1 cost is: "+Helmet1.cost);
        System.out.println("Helmet1 shape is: "+Helmet1.shape);

        Helmet Helmet2=new Helmet("Halfhelmet","safety");
        System.out.println("Helmet2 types  is: "+Helmet2.types);
        System.out.println("Helmet2 use is: "+Helmet2.use);
        System.out.println("Helmet2 rating is: "+Helmet2.rating);
        System.out.println("Helmet2 cost is: "+Helmet2.cost);
        System.out.println("Helmet2 shape is: "+Helmet2.shape);
		
		Helmet Helmet3=new Helmet("Halfhelmet","safety",4);
        System.out.println("Helmet3 types is: "+Helmet3.types);
        System.out.println("Helmet3 use is: "+Helmet3.use);
        System.out.println("Helmet3 rating is: "+Helmet3.rating);
        System.out.println("Helmet3 cost is: "+Helmet3.cost);
        System.out.println("Helmet3 shape is: "+Helmet3.shape);
		
		Helmet Helmet4=new Helmet("Halfhelmet","safety",4,2000);
        System.out.println("Helmet4 types is: "+Helmet4.types);
        System.out.println("Helmet4 use is: "+Helmet4.use);
        System.out.println("Helmet4 rating is: "+Helmet4.rating);
        System.out.println("Helmet4 cost is: "+Helmet4.cost);
        System.out.println("Helmet4 shape is: "+Helmet4.shape);
		
		Helmet Helmet5=new Helmet("Halfhelmet","safety",4,2000,"longoval");
        System.out.println("Helmet5 types is: "+Helmet5.types);
        System.out.println("Helmet5 use is: "+Helmet5.use);
        System.out.println("Helmet5 rating is: "+Helmet5.rating);
        System.out.println("Helmet5 cost is: "+Helmet5.cost);
        System.out.println("Helmet5 shape is: "+Helmet5.shape);
		
		System.out.println("Ending HelmetStarter");
    }
}