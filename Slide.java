import java.awt.*;
import java.applet.*;

public class Slide{
  public static void drawLadder(Graphics g){
    g.setColor(new Color(204,102,0));
    g.fillRect(250,110,20,290);
    //draw Snubs
  }
  public static void drawRamp(Graphics g){
    Polygon Bruh = new Polygon();
    Bruh.addPoint(50,400);
    Bruh.addPoint(250,130);
    Bruh.addPoint(250,160);
    Bruh.addPoint(80,400);
    g.setColor(new Color(255,77,71));
    g.fillPolygon(Bruh);
  }
  public static void drawSnubs(Graphics g){
    g.setColor(new Color(255,157,0));
      for (int y=0;y<=6;y++){
        g.fillRect(270,380-(40*y),20,20);
    }
  }
}
