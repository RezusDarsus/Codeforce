import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();
        scan.close();
        a = b.length();
        boolean flag = true;
            if(a < 26){
                flag = false;
            }
            b= b.toLowerCase();
                for(char d = 'a'; d <='z';d++){
                    if(b.indexOf(d) < 0){
                        flag = false;
                        break;
                    }
                }
                if (flag == true){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
    }
}
