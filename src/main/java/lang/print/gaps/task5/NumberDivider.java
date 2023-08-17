package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        int result = toBeDivided / 5;
        System.out.println( result);
    }
    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        int numberToBeDivided = 19;
        divider.divide(numberToBeDivided);
    }
}
