import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 0, B = 0, C = 0, D = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 2) D++;
            if (m == 3) C++;
            if (m == 4) B++;
            if (m == 5) A++;
        }
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}