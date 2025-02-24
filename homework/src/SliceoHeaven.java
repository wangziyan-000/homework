public class SliceoHeaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    private String storeMenu;

    public String pizzaIngredients;
    private double pizzaPrice;
    private String sides;
    private String drinks;

    private String orderID;
    private double orderTotal;
    public void takeOrder(String id, String piin, double total,String side,String drink,double pPrice){
        pizzaIngredients = piin;
        orderID = id;
        orderTotal = total;
        sides = side;
        drinks = drink;
        pizzaPrice = pPrice;


        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");

        try{
            Thread.sleep(5000);
            makePizza( piin);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

        printReceipt();


    }
    private void makePizza(String piin){
        pizzaIngredients = piin;
    }
    
    private void printReceipt(){
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);
        System.out.println("Order pizzaIngredients: " + pizzaIngredients);
        System.out.println("Order sides: " + sides);
        System.out.println("Order drinks: " + drinks);
        System.out.println("Order  pizzaPrice: " + pizzaPrice);
        System.out.println("Order Total: " + orderTotal);
    }
    
}