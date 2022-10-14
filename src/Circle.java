
public class Circle {
    int radius ;
    private final float PI=3.14f;



    public void area(){
        System.out.println("area= "+PI*(radius * radius)+" m2");
    }
    public void circumference(){
        System.out.println("circumference= "+PI*radius*2+" m");
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
