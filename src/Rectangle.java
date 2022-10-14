public class Rectangle extends Shape{
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;
    private String color = "Black";

    public Rectangle(){}

    public Rectangle(double  size1, double size2, double size3,String color){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.color = color;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public void setPerimeter(double size1, double size2, double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;

    }
    public double getPerimeter(){
        double perimeter;
        perimeter = size1 + size2 + size3;
        return perimeter;
    }
    public void setArea(double size1, double size2, double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public double getArea(){
        double haftPerimeter;
        haftPerimeter = (size1 + size2 + size3)/2;
        double Area;
        Area = Math.sqrt(haftPerimeter * (haftPerimeter - size1)
                * (haftPerimeter -size2)
                * (haftPerimeter - size3));
        return Area;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle have: size1 = " + size1
                + ",size2 = " + size2
                + ",size3 = " + size3 + "\n"
                + "Perimeter = " + getPerimeter() + "\n"
                + "Area = " + getArea() + "\n"
                + "Color = " + getColor();
    }
}

