public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cashValue){
        cash = cashValue;
        miles = (int)(cash / 0.0035);
    }
    public RewardValue(int mileValue){
        miles = mileValue;
        cash = (double)mileValue * 0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }
}
