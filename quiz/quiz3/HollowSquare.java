package quiz3;

public class HollowSquare extends Shape{
    public HollowSquare(){
    }

    public HollowSquare(String name){
        super(name);
    }

    public HollowSquare(String name, double length){
        super(name,length);
    }

    public void PlantTree(){
        int tree = 0;
        for(int x = 0 ; x<super.getLength() ; x++){
            for(int y = 0 ; y<super.getLength() ; y++){
                if(y==0 || y==super.getLength()-1 || x==0 || x==super.getLength()-1){
                    System.out.print("T ");
                    tree++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        super.setTree(tree);
    }
}
