package lang.print.gaps.task5;

import java.util.Scanner;

public class NumberDivider {
    void divide(int toBeDivided) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        toBeDivided = scanner.nextInt();

        int result = toBeDivided / 5;

        System.out.println( result);

        scanner.close();
    }
}
