import java.util.Scanner;

public class Petya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int result = a.compareToIgnoreCase(b);
        if(result == 0) {
            System.out.println("0");
        } else if (result > 0){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }

    }
}
