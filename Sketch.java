import processing.core.PApplet;

/**
 * This program uses loops to draw a 10x10 grid, a 5x5 grid of circles,
 * a horizontal grayscale gradient, and an 8 petaled flower
 * @author T. Guo
 *
 */

public class Sketch extends PApplet {
	
  // set screen size
  public void settings() {
    size(800, 800);
  }

  // setting backgrond color and variables for the middle x and y coordinates (saves a lot of time)
  public void setup() {
    background(255);
    midWidth = width / 2;
    midHeight = height / 2;
  }

  // declaring empty variables for midWidth and midHeight
  float midWidth;
  float midHeight;


  // draw method
   public void draw() {


    // ********** 10 x 10 GRID **********
    
    // set line details
    stroke(0);
    strokeWeight((float) (width / 160.0));

    // vertical lines
	  for (float x = width / 20; x < midWidth; x += width / 20) {
        line(x, 0, x, midHeight);
    }
    // horizontal lines 
    for (float y = height / 20; y < midHeight; y += height / 20) {
      line(0, y, midWidth, y);
    }


    // ********** 5 x 5 CIRCLES **********
    
    // set circle color
    fill(220, 160, 160);

    // columns
    for (float circleX = midWidth + width / 12; circleX <= width - width / 12; circleX += width / 12) {
      // rows within each column
      for (float circleY = height / 12; circleY <= midHeight - height / 12; circleY += height / 12) {
        ellipse(circleX, circleY, width / 20, height / 20);
    }
  }


  // ********** HORIZONTAL GRAYSCALE GRADIENT **********
  
  strokeWeight(midWidth / 255);

  // draw 1 vertical line for every shade of gray from 0 to 255. 
  // each line is "midWidth / 255 pixels" wide and the lines are "midWidth / 255" pixels apart
  for (float x = 0; x < midWidth; x += midWidth / 255) {
    // set color to a shade of gray depending on x
    stroke(x / midWidth * 255);
    line(x, midHeight, x, height);
  }


  // ********** 8 PETALED FLOWER **********
  
  // set line outline color and petal color
  stroke(0);
  fill(215, 215, 20);

  // center the transformations on the middle of the fourth quadrant
  translate(width - midWidth / 2, height - midHeight / 2);

  // rotate by PI/4 radians (45 degrees) and draw a long oval to make 2 petals (repeat 4 times)
  for (int i = 0; i < 4; i++) {
    rotate(PI / 4);
    ellipse(0, 0, width / 3, height / 25);
  }
  
  // draw the center of the flower
  fill(30, 30, 0);
  ellipse(0, 0, width / 10, height / 10);

  }
}