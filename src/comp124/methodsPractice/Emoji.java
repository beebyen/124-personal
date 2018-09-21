package comp124.methodsPractice;

import comp124graphics.Arc;
import comp124graphics.CanvasWindow;
import comp124graphics.Ellipse;
import javafx.scene.shape.Circle;

import java.awt.*;

public class Emoji {

    public static void main(String[] args){

        CanvasWindow canvas = new CanvasWindow("Emoji", 500, 500);
        Ellipse eye1 = new Ellipse(20, 20, 80, 80);
        eye1.setStrokeColor(new Color(0, 0, 0));
        eye1.setStrokeWidth(4);
        canvas.add(eye1);

        Ellipse inside1 = new Ellipse(20, 20, 60, 60);
        inside1.setStrokeColor(new Color(0, 0, 0));
        inside1.setFillColor(new Color(0, 0, 0));
        canvas.add(inside1);

        Ellipse inside2 = new Ellipse(150, 20, 60, 60);
        inside2.setStrokeColor(new Color(0, 0, 0));
        inside2.setFillColor(new Color(0, 0, 0));
        canvas.add(inside2);

        Ellipse eye2 = new Ellipse(140, 10, 80, 80);
        eye2.setStrokeColor(new Color(0, 0, 0));
        eye2.setStrokeWidth(4);
        canvas.add(eye2);

        Arc mouth = new Arc(100.0, 75.0, 50, 50, 200.0, 140.0);
        mouth.setStrokeColor(new Color(255, 102, 102));
        mouth.setStrokeWidth(4);
        canvas.add(mouth);
    }
}
