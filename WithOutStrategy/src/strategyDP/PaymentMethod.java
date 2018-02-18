package strategyDP;

public class  PaymentMethod{
  private pType paymentType;
  private int amount;

  /*Setting Payment Type*/  
  public void setType(pType ptype){
    this.paymentType=ptype;
  }

  /*Setting Amount*/
  public void setAmount(int amout){
    this.amount=amount;
  }

  /*Calculating service charge for payment type*/
  public int calculateServiceCharge(int amount){
    if(paymentType==pType.CreditCard){
      return 5;
    }
    else if(paymentType==pType.DebitCard){
      return 1;
    }
    else if(paymentType==pType.DirectDeposit){
      return 0;
    }
    else{
      throw new IllegalArgumentException("IllegalArgumentException ");
    }
  }

}
