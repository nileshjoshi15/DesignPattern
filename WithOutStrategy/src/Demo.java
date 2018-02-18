import strategyDP.*;

public class Demo{
  public static void main(String[] args){

    /*Setting Amount*/
    int amount=100;

    /*Credit card as payment method*/
    PaymentMethod creditmdth=new PaymentMethod();
    creditmdth.setType(pType.CreditCard);
    creditmdth.setAmount(amount);
    int ccCharge=creditmdth.calculateServiceCharge(amount);
    System.out.println(String.format("service charge on creditcard : $%d",ccCharge));
    System.out.println();

    /*Debit card as payment method*/
    PaymentMethod dmdth=new PaymentMethod();
    dmdth.setType(pType.DebitCard);
    dmdth.setAmount(amount);
    int dcCharge=dmdth.calculateServiceCharge(amount);
    System.out.println(String.format("service charge on DebitCard : $%d",dcCharge));


  }
}
