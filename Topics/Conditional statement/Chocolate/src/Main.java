import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        if (K < 1 || K >= M * N) System.out.println("NO");
        else if (K % N == 0 || K % M == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}