public class TestRide {
    public static void main(String[] args) {
        Ride[] rides = {
                new Ride(5, 10, 9),   // Обычный тариф
                new Ride(10, 15, 18), // Повышенный тариф
                new Ride(60, 40, 12), // Премиум тариф
                new Ride(1, 5, 8),    // Скидочный тариф
                new Ride(-5, 10, 9)   // Ошибка с отрицательным значением
        };

        for (int i = 0; i < rides.length; i++) {
            try {
                double fare = rides[i].getFare();
                System.out.println("Стоимость поездки " + (i + 1) + ": $" + String.format("%.2f", fare));
            } catch (Exception e) {
                System.out.println("Ошибка на поездке " + (i + 1) + ": " + e.getMessage());
            }
        }
    }
}