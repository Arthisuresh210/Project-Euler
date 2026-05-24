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

        int count = 0;
        int number = 1;

        while (count < 10001) {

            number++;

            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(number);
    }
}
