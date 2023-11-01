class Client{
static String purchaseproduct(String clientName, String product, int quantity) {
        System.out.println("Starting in client");
        boolean purchase=Amazon.onlinepurchase(clientName,product,quantity);
        if (purchase) {
            System.out.println("Product is purchased successfully");
        } else {
            System.out.println("product is not purchased");
        }
        return "Ending in client";
    }
}