class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleQ1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());

        Circle c2 = new Circle(7);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.calculateArea());
    }
}
