import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("D:/java/AssignmentOne/files/file1.txt");
        Scanner sc1 = new Scanner(file1);

        Shape shape = new Shape();

        while (sc1.hasNextDouble()) {
            double x = sc1.nextDouble();
            double y = sc1.nextDouble();
            Point pt = new Point( x, y);
            shape.addPoint(pt);
        }

        {
            double longestSide = shape.longestSide();
            double averageLength = shape.averageLength();
            double perimeter = shape.calculatePerimeter();

            System.out.println("File 1 calculations:");

            for (int i = 0; i < shape.points.size() - 1; i++) {
                double currentDistance = shape.points.get(i).distance(shape.points.get(i + 1));
                System.out.println("Distance from " + (i + 1) + " point to " + (i + 2) + " point: " + currentDistance);
            }

            double lastDistance = shape.points.get(0).distance(shape.points.get(shape.points.size() - 1));
            System.out.println("Distance from " + (shape.points.size()) + " point to " + 1 + " point: " + lastDistance);

            System.out.println("Longest side of the shape: " + longestSide);
            System.out.println("Average length of the shape: " + averageLength);
            System.out.println("Perimeter of the shape: " + perimeter);

            sc1.close();
            System.out.println();
        }

        File file2 = new File("D:/java/AssignmentOne/files/file2.txt");
        Scanner sc2 = new Scanner(file2);

        Shape shape2 = new Shape();

        while (sc2.hasNextDouble()) {
            double x = sc2.nextDouble();
            double y = sc2.nextDouble();
            Point pt = new Point( x, y);
            shape2.addPoint(pt);
        }

        System.out.println("File 2 calculations:");

        {
            double longestSide = shape2.longestSide();
            double averageLength = shape2.averageLength();
            double perimeter = shape2.calculatePerimeter();

            for (int i = 0; i < shape2.points.size() - 1; i++) {
                double currentDistance = shape2.points.get(i).distance(shape2.points.get(i + 1));
                System.out.println("Distance from " + (i + 1) + " point to " + (i + 2) + " point: " + currentDistance);
            }

            double lastDistance = shape2.points.get(0).distance(shape2.points.get(shape2.points.size() - 1));
            System.out.println("Distance from " + (shape2.points.size()) + " point to " + 1 + " point: " + lastDistance);

            System.out.println("Longest side of the shape: " + longestSide);
            System.out.println("Average length of the shape: " + averageLength);
            System.out.println("Perimeter of the shape: " + perimeter);

            sc2.close();
            System.out.println();
        }

    }
}



