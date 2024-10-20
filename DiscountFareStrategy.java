public class DiscountFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return Math.max(3, distanceKm * 0.80 + durationMin * 0.20);
    }
}