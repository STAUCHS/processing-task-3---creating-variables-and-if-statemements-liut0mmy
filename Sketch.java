import processing.core.PApplet; 

public class Sketch extends PApplet {

  // Declare Variables
  float rectX;
  float rectY;
  float triangleX;
  float triangleY;
  float triangleZ;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 1000);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(101, 194, 181);

    // Show current time
    int hr = hour();
    int min = minute();

    fill(0);
    textSize(40);
    text(hr, 15, 40);
    text(min, 55, 40);


    // House
    rectX = random(0,1000);
    rectY = random(0,1000);
    
    triangleX = random(0, 1000);
    triangleY = random(0, 1000);
    triangleZ = random(0, 1000);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Roof for house
    fill(191, 101, 101);
    stroke(0);
    strokeWeight(5);
    triangle(triangleX, triangleY, triangleX + 100, triangleY - 50, triangleX + 200, triangleY);

    // House Base
    fill(196, 149, 134);
    stroke(0);
    strokeWeight(3);
    rect(triangleX, triangleY, 200, 200);

    }
}
