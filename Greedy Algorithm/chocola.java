// We are given a bar of chocolate composed of m*n square pieces. One should break the chocolate into single squares. Parts of the chocolate may be broken along the vertical and horizontal lines as indicated by the broken lines in the picture.

// A single break of a part of the chocolate along a chosen vertical or horizontal line divides that part into two smaller ones. Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines with x1, x2, ..., xm-1 and along horizontal lines with y1, y2, ..., yn-1.

// The cost of breaking the whole bar into single squares is the sum of the successive breaks. One should compute the minimal cost of breaking the whole chocolate into single squares

import java.util.*;
public class chocola {
    public static void main(String args[]){
        int n = 4, m = 6;

        Integer verCost[] = {2, 1, 3, 1, 4};   //vertical cost
        Integer horCost[] = {4, 1, 2};         //horizontal cost

        // sorting the vertical cost in descending order
        Arrays.sort(verCost, Collections.reverseOrder());

        // sorting the horizontal cost in descending order
        Arrays.sort(horCost, Collections.reverseOrder());

        int h = 0;     //horizontal pointer to trace horizontal cost
        int v = 0;     //vertical pointer to trace vertical cost

        int hp = 1;     //horizontal pieces
        int vp = 1;     //vertical pieces

        int cost = 0;

        while(h < horCost.length && v < verCost.length){
            if(verCost[v] >= horCost[h]){
                cost += (verCost[v] * hp);
                vp++;     //as vertical cut lagayu to vertical piece increase thy
                v++; 
            }
            else{
                cost += (horCost[h] * vp);
                hp++;    ////as horizontal cut lagayu to horizontal piece increase thy
                h++;
            }
        }

        // if  some vertical cost is left
        while(v < verCost.length){
            cost += (verCost[v] * hp);
            vp++;
            v++;
        }

        // if  some horizontal cost is left
        while(h < horCost.length){
            cost += (horCost[h] * vp);
            hp++;
            h++;
        }

        System.out.println("minimal cost of cutting is: " + cost);
    }    
}