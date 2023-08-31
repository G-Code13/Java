public class Bank {
  
  int accountNumbers;
  int cash;
  double loan;
  double deposit;
  double withdraw;

  public Bank(){

  }

  public int getAccountNumbers() {
    return accountNumbers;
  }

  public void setAccountNumbers(int accountNumbers) {
    this.accountNumbers = accountNumbers;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public double getLoan() {
    return loan;
  }

  public void setLoan(double loan) {
    this.loan = loan;
  }

  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public double getWithdraw() {
    return withdraw;
  }

  public void setWithdraw(double withdraw) {
    this.withdraw = withdraw;
  }
  
}
