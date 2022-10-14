import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        double size1;
        double size2;
        double size3;
        String color;

        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Enter size1: ");
        size1 = scanner.nextDouble();
        System.out.println("Enter size2: ");
        size2 = scanner.nextDouble();
        System.out.println("Enter size3: ");
        size3 = scanner.nextDouble();
        System.out.println("Enter color: ");
        color = scanner.nextLine();


        Rectangle rectangle1 = new Rectangle(size1,size2,size3,color);
        System.out.println(rectangle1);
    }
}
