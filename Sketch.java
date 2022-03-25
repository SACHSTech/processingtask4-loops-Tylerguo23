import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
    midWidth = width / 2;
    midHeight = height / 2;
  }
  float midWidth;
  float midHeight;


  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    stroke(0);
    strokeWeight(5);
	  for (int x = width / 20; x < midWidth; x += width / 20){
        line(x, 0, x, midHeight);
    }
    for (int y = height / 20; y < midHeight; y += height / 20){
      line(0, y, midWidth, y);
    }

    fill(220, 160, 160);
    for (int circleX = (int)(midWidth + width / 12); circleX <= width - width / 12; circleX += width / 12){
      for (int circleY = width / 12; circleY <= midHeight - height / 12; circleY += width / 12){
        ellipse(circleX, circleY, width / 20, height / 20);
    }
  }
  }
  
  // define other methods down here.
}