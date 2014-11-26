
import TurtleGraphics.Pen;

public class Rect extends  AbstractShape {

    private double xPos, yPos, width, height;

    public Rect() {
        super();
        width = 1;
        height = 1;
    }

    public Rect(double x, double y, double w, double h) {
        super(x,y);
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }
    public double perimeter(){
        return (width *2)+ (height *2);
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos, xPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }

    public String toString() {
        String str = "This is a Rectangle\n";
        str += "WIDTH: " + width + "\tHEIGHT: " + height + "\n";
        str+= "PERIMETER: "+ perimeter();
        str += "\n" + super.toString();
        return str;
    }

}
