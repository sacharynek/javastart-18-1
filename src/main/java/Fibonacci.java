class Fibonacci {

    static long calculateFibElements(int last) {
        long a = 0, b = 1, c = 0, sum = 0;
        if (last <= 0) {
            return 0;
        }

        for (int i = 1; i < last; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println("element numer " + i + " ciagu fibunacciego to " + c);
            if (c >= 4_000_000) {
                break;
            }
            if (c % 2 == 0) {
                sum += c;
            }
        }

        return sum;
    }
}
