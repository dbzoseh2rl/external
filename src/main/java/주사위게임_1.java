public class 주사위게임_1 {
    public static void main(String[] args) {
        System.out.println(Solution(3, 5));
        System.out.println(Solution(6, 1));
        System.out.println(Solution(2, 4));
        System.out.println(Solution(6, 3));
    }

    public static int Solution(int a, int b) {
        // a와 b 모두 홀수인 경우
        if (a % 2 != 0 && b % 2 != 0) {
            return (a * a) + (b * b);
        }

        // a와 b 중 하나만 홀수인 경우 (두 수의 합이 홀수면 하나만 홀수임)
        else if ((a + b) % 2 != 0) {
            return 2 * (a + b);
        }

        // 그 외 (모두 짝수인 경우)
        else {
            return Math.abs(a - b);
        }
    }
}