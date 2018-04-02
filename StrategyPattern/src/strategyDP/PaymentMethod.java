package strategyDP;

public class  PaymentMethod{
  private pType paymentType;
  private int amount;
  private IChargeStrategy strategy;

  public void setType(pType ptype){
    this.paymentType=ptype;
  }

  public void setAmount(int amout){
    this.amount=amount;
  }

  /*Setting the strategy*/
  public PaymentMethod(IChargeStrategy _strategy){
    this.strategy=_strategy;
  }

  /*Delegatin task to strategy class*/
  public int calculateServiceCharge(int amount){
    return this.strategy.calServiceCharge(amount);
  }

}
