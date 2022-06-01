public class ReleaseMovie extends Movie {

    public ReleaseMovie(String title) {
        super(title);
    }

    @Override
    double determineAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int determineFrequentRentalPoint(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
