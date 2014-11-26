
import TurtleGraphics.Pen;

public class Triangle extends AbstractShape {
    private double x3, x2, y2, y3;

       public Triangle(){
           super();
           
       }
    public double area() {
        return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2)+ (x3*yPos-xPos*y3)) /2;  
    }

    public double perimeter() {
        return Math.sqrt((xPos - x2) + (xPos - x2) + (yPos - y2) * (yPos - y2));
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos,yPos);
    }

    public void stretchBy(double factor) {
        x2=(x2-xPos) * factor + xPos;
        y2=(y2-yPos) * factor + yPos;
        x3=(x3-xPos) * factor + xPos;
        y3=(y3-yPos) * factor + yPos;
       
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
        x2=(x2-xPos);
    }
}
