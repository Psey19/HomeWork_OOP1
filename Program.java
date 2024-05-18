public class Program {
    public static void main(String[] args) {
        Product product1 = new HotDrink("coffee", 180, 0.4, 65);
        Product product2 = new HotDrink("tea", 100, 0.5, 80);
        Product product3 = new HotDrink("cappuccino", 250, 0.3, 60);


        VendingMachineHotDrink vMachine = new VendingMachineHotDrink();
        vMachine.addProduct(product1);
        vMachine.addProduct(product2);
        vMachine.addProduct(product3);
        System.out.println(vMachine.getProduct("coffee", 0.4, 65));
    }
}
