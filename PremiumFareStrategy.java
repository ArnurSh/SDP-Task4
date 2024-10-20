public class PremiumFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distanceKm, double durationMin) {
        return Math.max(10, distanceKm * 2.00 + durationMin * 0.50);
    }
}