package models;
public class Shape {
    private final Point[] points;
    public Shape(Point[] points) {
        this. points = points;
    }
    public double perimeter() { //creating Perimeter
        double perimeter = 0;
        int n = points.length;
        for (int i=0;i<n;i++){
            Point currentPoint = points[i];
            Point nextPoint = points[(i+1)%n]; //wrapping around to the first point for the last iteration
            perimeter += currentPoint.distanceTo(nextPoint); //to calculate the perimeter of any shape, we need to sum the length of all sides
        }
        return perimeter;
    }
    public double longestSide(){ //creating longestSide
        double longestSide = 0;
        for(int i=0;i<points.length;i++){
            Point currentPoint = points[i];
            Point nextPoint = points[(i+1)%points.length];
            double currentDistance = currentPoint.distanceTo(nextPoint);
            if (currentDistance>longestSide) {
                longestSide = currentDistance;
            }
        }
        return longestSide;
    }
    public double averageSide(){ //creating averageSide
        double totalLength = 0;
        int n = points.length;
        for (int i=0; i<n; i++){
            Point currentPoint = points[i];
            Point nextPoint = points[(i+1)%n];
            totalLength += currentPoint.distanceTo(nextPoint);
        }
        return totalLength/n; //for simplicity, dividing totalLength of all points to n
    }
}
