public class Circle extends Geometry{
    public Circle(){
    }

    public Circle(double length){
        super(length);
    }

    public double calculatePerimeter(){
        return 2*Math.PI*getLength();
    }

    public double calculateArea(){
        return Math.PI*Math.pow(getLength(),2);
    }

    public String getGeoType(){
        return "";
    }
}
