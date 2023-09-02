package quiz3;

public class Square extends Shape{
    public Square(){
    }

    public Square(String name){
        super(name);
    }

    public Square(String name, double length){
        super(name,length);
    }

    public void PlantTree(){
        int tree = 0;
        for(int x = 0 ; x<super.getLength() ; x++){
            for(int y = 0 ; y<super.getLength() ; y++){
                System.out.print("T ");
                tree++;
            }
            System.out.println();
        }
        super.setTree(tree);
    }
}
