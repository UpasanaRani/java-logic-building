public class evenodd {

    public static void checkevenodd() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even:" + i);
            } else {
                System.out.println("Odd:" + i);
            }
        }
    }

    public static void main(String[] args) {

        checkevenodd();
    }
}
