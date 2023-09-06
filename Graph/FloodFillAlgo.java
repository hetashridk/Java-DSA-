import java.util.Arrays;

public class FloodFillAlgo {

    public static void helperFunction(int[][] image, int sr, int sc, int color, boolean visited[][], int originalColor){

        //base case
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != originalColor){
            return;
        }

        image[sr][sc] = color;

        // left
        helperFunction(image, sr, sc - 1, color, visited, originalColor);

        // right
        helperFunction(image, sr, sc + 1, color, visited, originalColor);

        // up
        helperFunction(image, sr - 1, sc, color, visited, originalColor);

        //down
        helperFunction(image, sr + 1, sc, color, visited, originalColor);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color){  //TC: O(m * n)
        boolean visited[][] = new boolean[image.length][image[0].length];
        helperFunction(image, sr, sc, color, visited, image[sr][sc]);

        return image;
    }
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1},
                         {1, 1, 0},
                         {1, 0, 1}};
        floodFill(image, 1, 1, 2);

        // printing array
       for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                 System.out.print(image[i][j] + " ");
        }
        System.out.println();
       }
    }
}
