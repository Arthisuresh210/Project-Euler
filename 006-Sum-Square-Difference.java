class Main {

    public static void main(String[] args) {

        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;

        int difference = squareOfSum - sumOfSquares;

        System.out.println(difference);
    }
}
