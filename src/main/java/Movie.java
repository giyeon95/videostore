public abstract class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    protected String title;
    protected int pricecode;

    public Movie(String title, int priceCode) {
        this.title = title;
        pricecode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    abstract double determineAmount(int daysRented);

    abstract int determineFrequentRentalPoint(int daysRented);
}
