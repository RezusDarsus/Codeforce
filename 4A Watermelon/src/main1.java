import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                int W = scan.nextInt();
                if( W  > 2 && W % 2 == 0 && W<= 100){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }

  