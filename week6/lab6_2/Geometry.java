public class Geometry {
    private double length = 0;
    private double perimeter = 0;
    private double area = 0;

    public Geometry(){
    }

    public Geometry(double length){
        this.length = length;
    }

    public int getLength(){
        return (int)length;
    }

    public void setLength(double length){
        this.length = length;
    }
    
    public double getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double calculatePerimeter(){
        return 0;
    }

    public double calculateArea(){
        return 0;
    }

    public String getGeoType(){
        return "";
    }
}
