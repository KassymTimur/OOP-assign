public class Point {
    private double x;
    private double y;
    public Point(double x, double y){ //creating Point
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point destination) { //creating distanceTo
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY); //formula for calculating distance
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";//the coordinates themselves
    }
}
