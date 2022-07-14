package week1_2nd;
/*
Write a Java program to compute the specified expressions and print the output.
Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
*/
public class Calculation {
    public static void main(String[] args) {
        double b = 25.5;
        double c = 40.5;
        double d = 3.5;
        double e = 4.5;


        double a = ((b * d - d * d) / (c - e));

        System.out.println("Expected Output : " +a);

    }
}
