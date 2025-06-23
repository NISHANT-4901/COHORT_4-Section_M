import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // because there are 7 days in a week
        int pushUp[] = new int[7];

        System.out.println("Give push-up details as per day (7 inputs)");
        System.out.println("Message: use [ 0 ] for rest days");
        for (int i = 0; i < pushUp.length; i++) {
            pushUp[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Data from user");
        for (int i : pushUp)
            System.out.print(i + " ");

        int totalSum = 0;
        int count = 0;
        for (int i = 0; i < pushUp.length; i++) {
            if (pushUp[i] == 0) {
                continue;
            }
            totalSum += pushUp[i];
            count++;
        }

        // to calculate average
        double average = (int) totalSum / count;

        System.out.println("Total Push-ups (excluding rest days): " + totalSum);
        System.out.println("Average Push-ups per active day: " + average);

    }
}
