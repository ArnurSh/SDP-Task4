public class Ride {
    private double distanceKm;
    private double durationMin;
    private int timeOfDay;

    public Ride(double distanceKm, double durationMin, int timeOfDay) {
        this.distanceKm = distanceKm;
        this.durationMin = durationMin;
        this.timeOfDay = timeOfDay;
    }

    public double getFare() {
        if (distanceKm < 0 || durationMin < 0) {
            throw new IllegalArgumentException("Distance or duration cannot be negative.");
        }
        RideContext context = new RideContext(new RegularFareStrategy());
        return context.calculateFare(distanceKm, durationMin, timeOfDay);
    }
}