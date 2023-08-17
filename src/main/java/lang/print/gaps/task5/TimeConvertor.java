package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    public void convert(float minutes) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        minutes = scanner.nextInt();

        float seconds = minutes * 60; // Convert minutes to seconds

        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");

        scanner.close();
    }
}
