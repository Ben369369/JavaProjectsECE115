import java.awt.Color;
import external.StdDraw;
class Olympic {
    public double x;
    public double y;
    public double radius;
    private Color color;

    public Olympic(double x, double y, double radius,Color color){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.color=color;
    }
    public void draw(){
        StdDraw.setXscale(-1.0,1.0);
        StdDraw.setYscale(-1.0,1.0);
        StdDraw.setPenColor(this.color);
        StdDraw.circle(this.x,this.y,this.radius);
        StdDraw.show();
    }

    public static void main(String[]args){
        Olympic circle1=new Olympic(0.35,0,0.15,Color.RED);
        circle1.draw();
        Olympic circle2=new Olympic(0,0,0.15,Color.BLACK);
        circle2.draw();
        Olympic circle3=new Olympic(-0.35,0,0.15,Color.BLUE);
        circle3.draw();
        Olympic circle4=new Olympic(-0.175,-0.15,0.15,Color.ORANGE);
        circle4.draw();
        Olympic circle5=new Olympic(0.175,-0.15,0.15,Color.GREEN);
        circle5.draw();

    }

}
