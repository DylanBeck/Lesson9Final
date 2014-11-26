
import TurtleGraphics.Pen;

//private double x, x1, x2, y, y1, y2, y3;

public class Triangle extends AbstractShape {
    private double x, x1, x2, y, y1, y2, y3;

       public Triangle(){
           super();
           
       }
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double perimeter() {
        return Math.sqrt((x1 - x2) + (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void stretchBy(double factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
}
