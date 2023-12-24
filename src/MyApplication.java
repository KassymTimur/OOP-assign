import models.Point;
import models.Shape;
public class MyApplication {
    public static void main(String[] args) {
        Point[] points = new Point[10]; //creating 10 points
        for (int i=0; i<10; i++){
            points[i] = new Point(Math.random()*100, Math.random()*100); //scattering 10 points in coordinate system
        }
        Shape shape = new Shape(points);
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}
