class Main {

    static boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int largestPalindrome = 0;

        for (int i = 100; i <= 999; i++) {

            for (int j = 100; j <= 999; j++) {

                int product = i * j;

                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        System.out.println(largestPalindrome);
    }
}
