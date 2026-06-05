
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int flag1 = 0;
        int flag2 = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                flag1 = flag1 | (1 << (ch - 'a'));
            }

            if (ch >= 'A' && ch <= 'Z') {
                flag2 = flag2 | (1 << (ch - 'A'));
            }
        }

        if (flag1 == (1 << 26) - 1 && flag2 == (1 << 26) - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
