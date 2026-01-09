import java.util.*;

public class greatestofthreeno {

    public static void calcgreatestofthreenos(int a, int b, int c) {

        if (a >= b && a >= c) {

            System.out.println("a is greater:" + a);

        }

        else if (b >= a && b >= c) {

            System.out.println("b is greatest:" + b);

        }

        else {

            System.out.println("c is greatest:" + c);
        }

    }

    public static void main(String[] args) {

        calcgreatestofthreenos(5, 7, 8);

    }
}
