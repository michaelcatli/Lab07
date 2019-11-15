// Lab07st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab07st extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(0,0,800,600); //this is the grid. :)
		Environment.drawSky(g);
		Environment.drawGrass(g);
		Swings.drawSideStable(g);
		Swings.drawTopStable(g);
		Swings.drawRopes(g);
		Swings.drawSeats(g);
		Slide.drawLadder(g);
		Slide.drawRamp(g);
		Slide.drawSnubs(g);
		Seesaw.drawBalance(g);
		Seesaw.drawHandles(g);
	}

}
