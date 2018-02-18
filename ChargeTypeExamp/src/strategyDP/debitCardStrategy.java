package strategyDP;

public class debitCardStrategy implements IChargeStrategy{
  @Override
  public int calServiceCharge(int amount){
    return 1;
  }
}
