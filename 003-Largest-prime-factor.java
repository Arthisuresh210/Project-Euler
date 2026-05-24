class Main {
    public static void main(String[] args) {

        long number = 600851475143L;
        long largestPrime = 0;

        for (long i = 2; i * i <= number; i++) {

            while (number % i == 0) {
                largestPrime = i;
                number = number / i;
            }
        }

        if (number > 1) {
            largestPrime = number;
        }

        System.out.println(largestPrime);
    }
}
