import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int  n =  scan.nextInt();
      int count = 0;
        while (0 < n){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int sum = 0;
            sum = a + b + c;
            if(sum  >= 2){
                count++;
            }
            sum = 0;
            n--;
        }
        System.out.println(count);
    }
}
