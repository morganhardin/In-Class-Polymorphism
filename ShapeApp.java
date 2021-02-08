public class ShapeApp 
{
	public static void main(String[] args) 
	{
		Circle aCircle = new Circle(4);
        Square aSquare = new Square(5);
        Rectangle aRectangle = new Rectangle(3,6);
        
        System.out.println("The area of a circle is: " + aCircle.getArea() + ".");
        System.out.println("The area of a square is: " + aSquare.getArea() + ".");
        System.out.println("The area of a rectangle is: " + aRectangle.getArea() + ".");
	}

}
