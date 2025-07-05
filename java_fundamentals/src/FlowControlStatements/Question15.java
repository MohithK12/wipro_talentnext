package FlowControlStatements;
import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a=0;a<n;a++) {
            for (int i = 0; i <= a; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
