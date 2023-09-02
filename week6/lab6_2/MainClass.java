public class MainClass {
    public static void main(String[] args){
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Triangle(4);
        printDetail(geometries[0]);
        System.out.println();
        geometries[1] = new Square(5);
        printDetail(geometries[1]);
        System.out.println();
        geometries[2] = new Circle(6);
        printDetail(geometries[2]);

    }

    public static void printDetail(Geometry g){
        System.out.println("This is a "+g.getGeoType());
        System.out.println("Length : "+g.getLength());
        System.out.println("Perimeter: "+g.calculatePerimeter());
        System.out.println("Area: "+g.calculateArea());
    }
}
