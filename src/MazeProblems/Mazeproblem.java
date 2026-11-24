package MazeProblems;

import java.util.ArrayList;

public class Mazeproblem {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true,true},
                {true,false,true,true},
                {true,true,false,true},
        };

        pathWithObstacle(" ",maze,0,0);
    }
    static int maze(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left=maze(row-1,col);
        int right=maze(row,col-1);
        return left+right;
    }

    static void path(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
        }


        if(row>1){
            path(p+'R',row-1,col);
        }
        if(col>1) {
            path(p + 'D', row, col - 1);
        }
    }

    static void pathDig(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
        }
        if(row>1 && col>1){
            pathDig(p+'D',row-1,col-1);
        }

        if(row>1){
            pathDig(p+'H',row-1,col);
        }
        if(col>1) {
            pathDig(p + 'V', row, col - 1);
        }
    }

    static void pathWithObstacle(String p,boolean [][] arr,int row,int col){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[row][col]){
            return;
        }
        if(row<arr.length-1 ){
            pathWithObstacle(p+'H',arr,row+1,col);
        }
        if(col<arr[0].length-1 ) {
            pathWithObstacle(p + 'V',arr, row, col +1);
        }
    }
}


