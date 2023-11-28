import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) {
                    String str = scan.next();

                    if (str.length() > 10) {
                        System.out.println(str.charAt(0) + "" + (str.length() - (2)) + "" + str.charAt(str.length() - 1));
                    } else {
                        System.out.println(str);
                    }
                }
            }
        }
    