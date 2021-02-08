public class Square extends Rectangle
{
	private double side;
    
    public Square(double side)
    {
        super(side, side);
        this.side = side;
        calculateArea();
    }
    protected void calculateArea()
    {
        area = Math.pow(side, 2);
    }
    public double getArea()
    {
        return area;
    }
}
