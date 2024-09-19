public class YearPop {
    private int year;
    private double pop;

    public YearPop() {
        this.year = 0;
        this.pop = 0;
    }

    public YearPop(int year, double pop) {
        this.year = year;
        this.pop = pop;
    }

    // getters
    public int getYear() {
        return year;
    }

    public double getPop() {
        return pop;
    }
}
