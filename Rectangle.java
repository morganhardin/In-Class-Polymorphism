public class Rectangle extends Shape
{
	private double length;
    private double width;
    
    public Rectangle(double length, double width)
    {
    	super();
        this.length = length;
        this.width = width;
        calculateArea();
    }
    protected void calculateArea()
    {
        area = length * width;
    }
    public double getArea()
    {
        return area;
    }
}
