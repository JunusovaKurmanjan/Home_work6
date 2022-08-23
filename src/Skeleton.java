public class Skeleton extends Boss {
    private int countsArrow;

    public int getCountsArrow() {
        return countsArrow;
    }

    public void setCountsArrow(int countsArrow) {
        this.countsArrow = countsArrow;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " CountsArrow " + getCountsArrow();
    }
}
