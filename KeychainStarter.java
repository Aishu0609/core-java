class KeychainStarter{

    public static void main(String[] args){

        System.out.println("Staring in keychain");

        Keychain Keychain=new Keychain();
        System.out.println("keychain design is: "+Keychain.design);
        System.out.println("keychain type is: "+Keychain.type);
        System.out.println("keychain noofbeads is: "+Keychain.noofbeads);
        System.out.println("keychain cost is: "+Keychain.cost);
        System.out.println("keychain shape is: "+Keychain.shape);

        Keychain Keychain1=new Keychain("metallic");
        System.out.println("keychain design is: "+Keychain1.design);
        System.out.println("keychain type is: "+Keychain1.type);
        System.out.println("keychain noofbeads is: "+Keychain1.noofbeads);
        System.out.println("keychain cost is: "+Keychain1.cost);
        System.out.println("keychain shape is: "+Keychain1.shape);

        Keychain Keychain2=new Keychain("metallic","glass");
        System.out.println("keychain design is: "+Keychain2.design);
        System.out.println("keychain type is: "+Keychain2.type);
        System.out.println("keychain noofbeads is: "+Keychain2.noofbeads);
        System.out.println("keychain cost is: "+Keychain2.cost);
        System.out.println("keychain shape is: "+Keychain2.shape);

        Keychain Keychain3=new Keychain("metallic","glass",20);
        System.out.println("keychain design is: "+Keychain3.design);
        System.out.println("keychain type is: "+Keychain3.type);
        System.out.println("keychain noofbeads is: "+Keychain3.noofbeads);
        System.out.println("keychain cost is: "+Keychain3.cost);
        System.out.println("keychain shape is: "+Keychain3.shape);

        Keychain Keychain4=new Keychain("metallic","glass",20,150);
        System.out.println("keychain design is: "+Keychain4.design);
        System.out.println("keychain type is: "+Keychain4.type);
        System.out.println("keychain noofbeads is: "+Keychain4.noofbeads);
        System.out.println("keychain cost is: "+Keychain4.cost);
        System.out.println("keychain shape is: "+Keychain4.shape);


        Keychain Keychain5=new Keychain("metallic","glass",20,150,"heart");
        System.out.println("keychain design is: "+Keychain5.design);
        System.out.println("keychain type is: "+Keychain5.type);
        System.out.println("keychain noofbeads is: "+Keychain5.noofbeads);
        System.out.println("keychain cost is: "+Keychain5.cost);
        System.out.println("keychain shape is: "+Keychain5.shape);

        System.out.println("Ending keychain");
    }
}