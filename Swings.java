import java.awt.*;
import java.applet.*;

public class Swings{
  public static void drawSideStable(Graphics g){
    g.setColor(new Color(102,51,0));
    g.fillRect(740,200,10,200);
    g.fillRect(540,200,10,200);
  }
  public static void drawTopStable(Graphics g){
    g.setColor(new Color(102,51,0));
    g.fillRect(540,190,210,10);
  }
  public static void drawRopes(Graphics g){
    g.setColor(new Color(102,51,0));
    g.fillRect(600,200,2,160);
    g.fillRect(630,200,2,160);
    g.fillRect(670,200,2,160);
    g.fillRect(700,200,2,160);
  }
  public static void drawSeats(Graphics g){
    g.setColor(new Color(219,82,82));
    g.fillRect(602,355,28,5);
    g.fillRect(672,355,28,5);
  }

}
