public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static boolean palindrome(String s) {
        return s.charAt(0) == s.charAt(s.length()-1);
    }
}
