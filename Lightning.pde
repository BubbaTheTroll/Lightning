

void setup()
{
  size(300,300);
  strokeWeight(10);
  background(0);
  noLoop();
}
void draw(){
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
void mousePressed()
{
	redraw();
}

