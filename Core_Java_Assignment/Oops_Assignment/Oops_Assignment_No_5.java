abstract class Shape{
abstract void draw();
       }		
 class Line extends Shape
     {
	public void draw()
	{
		System.out.println("Draws a line");
	}
     }
class Rectangle extends Shape
    {
	public void draw()
	{
		System.out.println("Draws a rectangle");
	}
     }
class Cube extends Shape
    {
	public void draw()
	{
		System.out.println("Draws a cube");
	}
    }
 class MainShape{
  public static void main(String[] args)
	{
		Line line = new Line();
		Rectangle rectangle = new Rectangle();
		Cube cube = new Cube();
		line.draw();
		rectangle.draw();
		cube.draw();
		
	}
    }

