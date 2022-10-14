import java.util.Scanner;
public class ShapeTest {
    public static void main(String[] args) {
        double size1;
        double size2;
        double size3;

        Scanner scanner = new Scanner(System.in);

        Shape shape = new Shape();
        System.out.println(shape);
        System.out.println("Enter size1: ");
        size1 = scanner.nextDouble();
        System.out.println("Enter size2: ");
        size2 = scanner.nextDouble();
        System.out.println("Enter size3: ");
        size3 = scanner.nextDouble();


        Shape shape1 = new Shape(size1,size2,size3);
        System.out.println(shape1);
    }
}
