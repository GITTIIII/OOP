package quiz3;

public class Shape {
    private String name = "";
    private double length = 0;
    private int tree = 0;

    public Shape(){
    }

    public Shape(String name){
        this.name = name;
    }

    public Shape(String name, double length){
        this.name = name;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public int getTree(){
        return tree;
    }

    public void setTree(int tree){
        this.tree = tree;
    }

    public void PlantTree(){
    }
}
