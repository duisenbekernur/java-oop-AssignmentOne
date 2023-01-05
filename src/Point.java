public class Point {
    private double x;
    private double y;

    public Point() {

    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point pt2) {
        return Math.sqrt(Math.pow(Math.max(this.x, pt2.x) - Math.min(this.x, pt2.x), 2) + Math.pow(Math.max(this.y, pt2.y) - Math.min(this.y, pt2.y), 2) );
    }
}
