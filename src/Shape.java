import java.util.ArrayList;

public class Shape {
    public ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point pt) {
        points.add(pt);
    }

    public ArrayList<Point> getPoints() {
        return this.points;
    }

    public double longestSide() {
        double lastSide = points.get(points.size() - 1).distance(points.get(0));
        double longSide = lastSide;
        for (int i = 0; i < points.size() - 1; i++) {
            double currentSide = points.get(i).distance(points.get(i+1));
            if(currentSide > longSide) {
                longSide = currentSide;
            }
        }

        return  longSide;
    }

    public double averageLength() {
        return this.calculatePerimeter() / points.size();
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for ( int i = 0; i<points.size() - 1; i++ ) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }
        perimeter += points.get(points.size() - 1).distance(points.get(0));

        return perimeter;
    }
}
