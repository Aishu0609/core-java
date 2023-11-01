class Amazon {
    static boolean onlinepurchase(String clientName,String product,int quantity){
        System.out.println("Starting in Amazon");
          int bill=Vendor.billProduct (product, quantity);

            if(clientName=="Divya" || clientName=="Shreyas" || clientName=="Shambu" || clientName=="Geetha" || clientName=="Nitin") {


                if(bill > 0) {
                    System.out.println(clientName + " your product billed " + bill);
                    System.out.println("Ending in Amazon");
                    return true;
                } else {
                    System.out.println("Product is not billed");
                    System.out.println("Ending in Amazon");
                    return false;
                }
            }
                    return false;
        
    }
}