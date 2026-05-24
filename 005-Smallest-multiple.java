class Main {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        long result = 1;

        for (int i = 1; i <= 20; i++) {
            result = lcm(result, i);
        }

        System.out.println(result);
    }
}
