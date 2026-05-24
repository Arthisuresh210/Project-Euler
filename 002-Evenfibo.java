class Main {
    public static void main(String[] args) {

        int first = 1;
        int second = 2;
        int sum = 0;

      
        while (second <= 4000000) {

            if (second % 2 == 0) {
                sum += second;
            }

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(sum);
    }
}
