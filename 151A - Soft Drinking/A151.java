import java.util.Scanner;

public class A151 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();
        int  np= scan.nextInt();


        int mil = (k *l) / nl;
        int slices = c * d;
        int salt = p / np;
        int min = Math.min(mil, slices);
        int min1 = Math.min(salt, min);

        int ans = min1 / n;
        System.out.println(ans);
    }
}
