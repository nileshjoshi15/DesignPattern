package strategyDP;

public class creditCardStrategy implements IChargeStrategy{
  @Override
  public int calServiceCharge(int amount){
    return 5;
  }
}
