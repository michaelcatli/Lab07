import java.awt.*;
import java.applet.*;

public class Seesaw{
  public static void drawBalance(Graphics g){
    g.setColor(new Color(255,0,204));
    Polygon BruhMan = new Polygon();
    BruhMan.addPoint(400,360);
    BruhMan.addPoint(400,400);
    BruhMan.addPoint(440,400);
    BruhMan.addPoint(440,370);
    g.fillPolygon(BruhMan);
    g.setColor(new Color(129,255,118));
    Polygon Slant = new Polygon();
    Slant.addPoint(340,345);
    Slant.addPoint(500,385);
    Slant.addPoint(503,373);
    Slant.addPoint(343,332);
    g.fillPolygon(Slant);
  }
  public static void drawHandles(Graphics g){
    g.setColor(new Color(255,0,0));
    Polygon Handle1 = new Polygon();
    Polygon Handle2 = new Polygon();
    Handle1.addPoint(355,335);
    Handle1.addPoint(359,336);
    Handle1.addPoint(362,324);
    Handle1.addPoint(359,323);
    g.fillPolygon(Handle1);
    Handle2.addPoint(483,367);
    Handle2.addPoint(487,368);
    Handle2.addPoint(490,356);
    Handle2.addPoint(487,355);
    g.fillPolygon(Handle2);
  }
}
