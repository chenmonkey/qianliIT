package JApplet;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class Text1 extends Applet{
	
	
public void paint(Graphics g) {
	Graphics2D g_2d=(Graphics2D)g;
	Arc2D arc=new Arc2D.Double(0, 0, 100, 100, -90, -180, Arc2D.PIE);
	g_2d.setColor(Color.BLACK);
	g_2d.fill(arc);
	
	g_2d.setColor(Color.red);
	arc.setArc(0,0,100,100,-90,180,Arc2D.PIE);
	g_2d.fill(arc);
	
	g_2d.setColor(Color.red);
	arc.setArc(25,0,50,50,-90,-180,Arc2D.PIE);
	g_2d.fill(arc);
	
	g_2d.setColor(Color.black);
	arc.setArc(25,50,50,50,90,-180,Arc2D.PIE);
	g_2d.fill(arc);
	
	Ellipse2D elli=new Ellipse2D.Double(0,100,100,100);
	g_2d.setColor(Color.green);
	g_2d.draw(elli);
	
	RoundRectangle2D Rrect=new RoundRectangle2D.Double(20, 140, 60, 30, 10, 10);
	g_2d.setColor(Color.blue);
	g_2d.fill(Rrect);
	
}
}
