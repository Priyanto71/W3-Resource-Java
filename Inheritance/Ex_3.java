class Shape{
    public double getArea(){
        System.out.println("Calculating area in Shape class");
        return 0.0;
    }
}
class Rectangle{
    private double length;
    private double width;
    public double getArea(double l, double w){
        this.length = l;
        this.width = w;
        return length*width;
    }
}
public class Ex_3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Generic Shape Area: "+shape.getArea());
        Rectangle rectangle = new Rectangle();
        double area= rectangle.getArea(5, 3);
        System.out.println("Rectangle Area: "+area);
    }
}
