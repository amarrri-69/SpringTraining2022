 public class RealQuadraticSolver {
    public static void realQuadraticSolver(double a, double b, double c) {
        double discriminate = Math.pow(b, 2) - (4 * a * c);

        if (discriminate < 0) {
            System.out.println("The solutions are imaginary. The discriminate is " + discriminate);
        }
        else {
            double x1 = (-b + Math.sqrt(discriminate)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminate)) / (2 * a);
            System.out.println("The solutions are " + x1 + " and " + x2); 
        }
    }
}
