public class avgarray {
    public static void main(String[] args) {
        float marks[] = { 34.5f, 56.8f, 38.9f, 56.2f };
        float sum = 0;

        for (float x : marks) {
            sum += x;

        }

        float avg = (sum / marks.length);

        System.out.println("The value of average array is: " + avg);
    }

}
