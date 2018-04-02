import strategyDP.*;

public class sDemo{
  public static void main(String[] args){

    /*Setting Amount*/
    int amount=100;

    /*Credit card as payment method*/
    PaymentMethod creditmdth=new PaymentMethod(new creditCardStrategy());
    creditmdth.setType(pType.CreditCard);
    creditmdth.setAmount(amount);
    int ccCharge=creditmdth.calculateServiceCharge(amount);
    System.out.println(String.format("service charge on creditcard : $%d",ccCharge));

    /*Debit card as payment method*/
    PaymentMethod dmdth=new PaymentMethod(new debitCardStrategy());
    dmdth.setType(pType.DebitCard);
    dmdth.setAmount(amount);
    int dcCharge=dmdth.calculateServiceCharge(amount);
    System.out.println(String.format("service charge on debtitcard : $%d",dcCharge));


  }
}
