import java.awt.*;
import java.applet.*;
//204,102,0
public class Environment{
  public static void drawGrass(Graphics g){
    g.setColor(new Color(0,255,0));
    g.fillRect(0,400,800,200);
  }
  public static void drawSky(Graphics g){
    g.setColor(new Color(0,0,255));
    g.fillRect(0,0,800,400);
  }
}
