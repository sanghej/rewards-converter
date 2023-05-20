public class RewardValue {
    private double cash;
    private int miles;

    RewardValue(double x) {
        this.cash = x;
        this.miles = (int)(x / 0.0035);
    }

    RewardValue(int y) {
        this.miles = y;
        this.cash = y * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}