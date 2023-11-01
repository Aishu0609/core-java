class Helmet {
		
		String types;
        String use;
        int rating;
        double cost;
        String shape;

        Helmet() {
            
			this("Halfhelmet", "Safety",4,2000,"longoval");
			System.out.println("Helmet is Created");
        }
        Helmet(String types) {

            this.types = types;
            System.out.println("Helmet types:" + types);

        }
        Helmet(String types, String use) {

            this.types = types;
            this.use = use;
            System.out.println("Helmet types:" + types);
            System.out.println("Helmet use:" + use);
        }
        Helmet(String types, String use, int rating){


            this.types = types;
            this.use = use;
            this.rating = rating;
            System.out.println("Helmet types:" + types);
            System.out.println("Helmet use:" + use);
            System.out.println("Helmet rating:" + rating);
        }
        Helmet(String types, String use, int rating,double cost){

            this.types = types;
            this.use = use;
            this.rating = rating;
            this.cost = cost;
            System.out.println("Helment types:" + types);
            System.out.println("Helment use:" + use);
            System.out.println("Helmet rating:" + rating);
            System.out.println("Helmet cost:" + cost);

        }
        Helmet(String types, String use, int rating,double cost, String shape){


            this.types = types;
            this.use = use;
            this.rating = rating;
            this.cost = cost;
            this.shape = shape;
			
			System.out.println("Helment types:" + types);
            System.out.println("Helment use:" + use);
            System.out.println("Helmet rating:" + rating);
            System.out.println("Helmet cost:" + cost);
			System.out.println("Helmet shape:" + shape);

        }
}
    