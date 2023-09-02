package quiz3;

public class Farm{
    public static void main(String[] args){
        Shape[] sites = new Shape[4];

        sites[0] = new Square("A Farm",3);

        sites[1] = new Square("B Farm");
        sites[1].setLength(5);

        sites[2] = new HollowSquare("C Farm");
        sites[2].setLength(7);

        sites[3] = new HollowSquare("D Farm");
        sites[3].setLength(6);
        printDetail(sites);
    }

    public static void printDetail(Shape[] shape){
        int count = 0;
        for(Shape s : shape){
            System.out.printf("< This is a %s >\n",s.getName());
            System.out.println();
            s.PlantTree();
            System.out.printf("There are %d trees.\n",s.getTree());

            if(count != shape.length-1){
                System.out.println();
            }
            
            count++;
        }
    }
}