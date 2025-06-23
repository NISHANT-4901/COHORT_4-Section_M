public class DigitalWatchSimulation {
    public static void main(String[] args) {
        outerLoop:
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.printf("%d:%d%n", hour, minute);
                if (hour == 13 && minute == 0){
                    System.out.println("Power cut  at 13:00. Stop watch.");
                    break outerLoop;
                }
            }
        }
    }
}