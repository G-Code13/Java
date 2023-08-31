public class Main {
    public static void main(String[] args) throws Exception{

        Customer customer1 = new Customer();
        customer1.makeChefSpecial(12.99);
        customer1.bakedPotato(2.99);
        customer1.makeChicken(7.99);
        customer1.broccoli(2.99);
        customer1.dineIn();

        
        Customer[] customers = new Customer[1];
        customers[0] = customer1;
        System.out.println(total(customers));

        System.out.println(" ");
        
        Customer customer2 = new Customer();
        customer2.makeSteak(11.99);
        customer2.greenBeans(2.99);
        customer2.toGo();
        System.out.println(" ");

    }
    public static double total(Customer[] customer){
        double sum = 0;
        for(Customer c: customer){
            sum += c.getAmt();
        }
        return sum;
    }
}
