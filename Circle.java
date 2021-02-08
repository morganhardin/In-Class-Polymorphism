public class Circle extends Shape
{
private double radius;
    
    public Circle(double radius)
    {
    	super();
        this.radius = radius;
        calculateArea();
    }
    protected void calculateArea()
    {
        area = Math.PI * Math.pow(radius,2);
    }
    public double getArea()
    {
        return area;
    }
}
