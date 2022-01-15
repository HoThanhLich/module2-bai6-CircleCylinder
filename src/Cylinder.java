public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super.setRadius(radius);
        this.height = height;
    }

    public double getVolume() {
        return Math.round(getArea() * height);
    }
    @Override
    public String toString(){
        return "Hình trụ bán kính: "+ getRadius()+ ", chiều cao: "+height+" có diện tích đáy là: " + super.getArea()+ " và thể tích là: "+ getVolume() ;
    }
}
