class Main {

    static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        long sum = 0;

        for (int i = 2; i < 2000000; i++) {

            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
