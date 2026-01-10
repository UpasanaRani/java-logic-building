public class checkarraynum {

    public static void main(String[] args) {
        int num1 = 0;
        int num[] = { 5, 6, 7, 8, 0, 1, 2 };
        boolean isInArray = false;
        for (int x : num) {
            if (num1 == x) {
                isInArray = true;
                break;

            }
        }

        if (isInArray) {
            System.out.println("number is in the array.");
        } else {
            System.out.println("number is not in the array.");
        }

    }
}
