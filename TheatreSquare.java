public class TheatreSquare {
    public static void main(String[] args) {
        System.out.println(flagstone(6,6,4));
    }
    public static int flagstone(int m ,int n, int a){
        int num1 = (int) Math.ceil((double) m / a);
        int num2 = (int) Math.ceil((double) n / a);

        return num1 * num2;
    }
}
