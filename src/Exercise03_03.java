import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise03_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e ,f: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if(a*d - b*c != 0) {
            double x = (e*d - b*f) / (a*d - b*c);
            double y = (a*f - e*c) / (a*d - b*c);
            System.out.println(a + "x + " + b + "y = " + e + "\n" + c + "x + " + d + "y = " + f + "\nx is " + x + " and y is " + y);
        } else {
            System.out.println("The equation has no solution.");
        }

        in.nextLine(); // use when scanner is used
    }
}
