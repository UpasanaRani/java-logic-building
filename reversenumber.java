class reversenumber {
    int n;
    int rev = 0;
    int digit = 0;

    reversenumber(int n) {
        for (int i = 0; i <= n; i++) {
            // n=121

            digit = n % 10;// gives the last digit
            rev = rev * 10 + digit;// shifts digit to left
            n = n / 10;// removes last digit
        }
        System.out.println(rev);

    }

    public static void main(String args[]) {
        reversenumber number = new reversenumber(724);
        // number.reversenumber(724);
        reversenumber number1 = new reversenumber(256);

    }

}
