package week3.lab.Lab3_2;
public class DrawingRectangle {
    public static void main(String[] args) {
        drawRectangle(5);
        System.out.println();
        drawRectangle(6, 4);
        System.out.println();
        drawRectangle(7, 3, '#');
        System.out.println();
        drawRectangle(8, 12, '@');
    }
    public static void drawRectangle(int length){
        System.out.println("A Square");
        for(int x = 0 ; x<length ; x++){
            for(int y = 0 ; y<length ; y++){
                if(y==0 || y==length-1 || x==0 || x==length-1){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int length, int width){
        System.out.println("A Rectangle");
        for(int x = 0 ; x<width ; x++){
            for(int y = 0 ; y<length ; y++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int length, int width, char ch){
        if(ch == '#'){
            System.out.println("A Parallelogram");
            for(int x = 0 ; x<width ; x++){
                for(int y = 0 ; y<width-x-1 ; y++){
                    System.out.print("  ");
                }
                for(int z = 0 ; z<length ; z++){
                    System.out.print("# ");
                }
                System.out.println();
            } 
        }
        else{
            drawRectangle(length, width);
        }
    }
}