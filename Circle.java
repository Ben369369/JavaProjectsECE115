public class Circle {
    public double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference(){
        return Math.PI * 2 * radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public static void main(String[] args){
        Circle circle1 = new Circle(10.0);
        System.out.println("Radius is:" + circle1.getRadius() + " and the area of the circle is " + circle1.calculateArea() + " and the circumfrence is " + circle1.calculateCircumference());
        
        circle1.setRadius(5.0);
        System.out.println("Radius is:" + circle1.getRadius() + " and the area of the circle is " + circle1.calculateArea() + " and the circumfrence is " + circle1.calculateCircumference());
    }
}