public class DineIn extends CashRegister{
  
  double tip = .20;
  
  public DineIn(){

  }
  public DineIn(double tip){
    
  }
  public double getTip() {
    return tip;
  }
  public void setTip(double tip) {
    this.tip = tip;
  }
  public void dineIn(){
    System.out.println("You will be dining in with us");
  }
 
}
