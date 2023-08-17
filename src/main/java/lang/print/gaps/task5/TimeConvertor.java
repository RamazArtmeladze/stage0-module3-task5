package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    public void convert(float minutes) {

        float seconds = minutes * 60.0f; // Convert minutes to seconds
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
    }

    public static void main(String[] args) {
        TimeConvertor convertor = new TimeConvertor();
        float minutesToConvert = 2.5f; // You can change this value
        convertor.convert(minutesToConvert);
    }
}
