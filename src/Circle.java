public class Circle {
    private double radius = 2;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius,2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Hình tròn bán kính "+ radius +", màu: "+getColor()+ ", có chu vi là " + getPerimeter() +", có diện tích là: "+ getArea();
    }
}
