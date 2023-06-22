public class displacement {
    public static float Displacement(String path){
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++){
            char dis = path.charAt(i);

            // for south
            if(dis == 'S'){
                y--;
            } 

            // for north
            else if(dis == 'N'){
                y++;
            }

            //for east
            else if(dis == 'E'){
                x++;
            }

            // for west
            else{
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){

        String path = "WNEENESENNN";
        System.out.println(Displacement(path));
    }    
}