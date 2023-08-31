public class AnotherClass {
    private int balance;
    private String name;

    public AnotherClass(){

    }
    
    public AnotherClass(int balance, String name){
        this.name = name;
        this.balance = balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

   public void setName(String name){
    this.name = name;
   }

   public String getName(){
    return name;
   }

   public String toString(){
    return name + ": " + balance;
   }
}
