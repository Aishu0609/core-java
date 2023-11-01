class Keychain {
		String design;
        String type;
        int noofbeads;
        double cost;
        String shape;

        Keychain() {
            
			this("Metallic", "glass", 20, 150, "heart");
			System.out.println("keychain is Created");
        }
        Keychain(String design) {

            this.design = design;
            System.out.println("Keychain design:" + design);

        }
        Keychain(String design, String type) {

            this.design = design;
            this.type = type;
            System.out.println("keychain design:" + design);
            System.out.println("keychain type:" + type);
        }
        Keychain(String design, String type, int noofbeads){


            this.design = design;
            this.type = type;
            this.noofbeads = noofbeads;
            System.out.println("keychain brand:" + design);
            System.out.println("keychain type:" + type);
            System.out.println("keychain noofbeads:" + noofbeads);
        }
        Keychain(String design, String type, int noofbeads, double cost){

            this.design = design;
            this.type = type;
            this.noofbeads = noofbeads;
            this.cost = cost;
            System.out.println("keychain brand:" + design);
            System.out.println("keychain type:" + type);
            System.out.println("keychain noofbeads:" + noofbeads);
            System.out.println("keychain cost:" + cost);

        }
        Keychain(String design, String type, int noofsheets, double cost, String shape){


            this.design = design;
            this.type = type;
            this.noofbeads = noofbeads;
            this.cost = cost;
            this.shape = shape;
            System.out.println("keychain brand:" + design);
            System.out.println("keychain type:" + type);
            System.out.println("keychain noofbeads:" + noofbeads);
            System.out.println("keychain cost:" + cost);
            System.out.println("keychain shape:" + shape);

        }
}
    