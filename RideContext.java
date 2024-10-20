public class RideContext {
    private FareStrategy strategy;

    public RideContext(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFare(double distanceKm, double durationMin, int timeOfDay) {
        if (timeOfDay >= 17 && timeOfDay <= 19) {
            setStrategy(new SurgeFareStrategy());
        } else if (distanceKm > 50) {
            setStrategy(new PremiumFareStrategy());
        } else if (distanceKm < 2) {
            setStrategy(new DiscountFareStrategy());
        }

        return strategy.calculateFare(distanceKm, durationMin);
    }
}