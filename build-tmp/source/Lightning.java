import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {



public void setup()
{
  size(300,300);
  strokeWeight(10);
  background(0);
  noLoop();
}
public void draw(){
	int startX, startY, endX, endY;
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 0;

	float newRandom1 = (int)(Math.random()*256);
	float newRandom2 = (int)(Math.random()*256);
	float newRandom3 = (int)(Math.random()*256);
	stroke(newRandom1, newRandom2, newRandom3);
	while(endX < 300){
		endX = startX + (int)(Math.random()*9);
		endY = startY+ (int)((Math.random()*18)-9);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}



}
public void mousePressed()
{
	redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
