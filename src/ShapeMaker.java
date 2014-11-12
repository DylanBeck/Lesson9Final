
import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.*;

public class ShapeMaker {

    public static void main(String[] args) {
        Shape s1;
        Pen p = new RainbowPen(new SketchPadWindow (400,400));
        double r, x, y;
        double w, h;
        int choice;
        KeyboardReader k = new KeyboardReader();
        //pick circle or rect
        while (true) {
            choice = k.readInt("Enter 1 for rectangle, 2 for circle: ");
            if (choice == 1 || choice == 2) {
                break;
            }
        }
        if (choice == 1) {
            w = k.readDouble("Enter width of rect ");
            h = k.readDouble("Enter height of rect ");
            s1 = new Rect(0, 0, w, h);
        } else {
            r = k.readDouble("Enter radius of circle ");
            s1 = new Circle(0, 0, r);
        }
        while (true) {
            s1.draw(p);
            x = k.readDouble("New x: ");
            y = k.readDouble("New y: ");
            //erase and move
            p.setColor(Color.white);
            s1.draw(p);
            s1.move(x, y);
            p.setColor(Color.blue);
            s1.draw(p);

        }//end while
    }//end main
}//end class
