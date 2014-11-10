
import TurtleGraphics.Pen;

public class Circle implements Shape {

    private double xPos, yPos, radius;

    public Circle() {
        xPos = 0;
        yPos = 0;
        radius = 1;
    }

    public Circle(double x, double y, double r) {
        xPos = 0;
        yPos = 0;
        radius = 1;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos, xPos);
        p.down();
        p.setDirection(0);
    //    p.move(width);
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos=xLoc;
        yPos=yLoc;
    }

    public void stretchBy(double factor) {
        radius *=factor;
    }
    public String toString(){
        String str= "This is a CIRCLE\n";
        str+="XLOC: "+xPos+ "\tYLOC: "+yPos+"\n";
        str+="RADIUS: "+radius +"\n";
        str+="AREA: "+ area();
        return str;
    }

}
