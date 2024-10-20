public class RegularFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return Math.max(5, distanceKm * 1.00 + durationMin * 0.25);
    }
}