import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int temp = 0;        
        int arr [] = {x1 , x2, x3};
       Arrays.sort(arr);
        
        System.out.println((arr[2] - arr[1] ) + (arr[1] - arr[0]));


        }
    }
