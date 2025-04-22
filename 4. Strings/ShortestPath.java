public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            // South
            if(dir  == 'S'){
                y--;
            }

            // North
            else if(dir == 'N'){
                y++;
            }

            // West
            else if(dir == 'W'){
                x--;
            }

            // East
            else{
                x++;
            }
        }

        // X2 is (x2-x1) whole square and Y2 is (y2-y1) whole square 
        int X2 = x*x;
        int Y2 = y*y;

        // Root of X sqaure  + Y sqaure
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
}
