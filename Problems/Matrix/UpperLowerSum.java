package Java_DSA.Problems.Matrix;
import java.util.*;

public class UpperLowerSum {
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        int upper = 0;
        int lower = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i<=j){
                    upper += matrix[i][j];
                }
                if(j<=i){
                    lower += matrix[i][j];
                }
            }
        }
        ans.add(upper);
        ans.add(lower);
        return ans;
    }

    public static void main(String[] args) {
        int mat[][]={{6, 5, 4},
                {1, 2, 5},
                {7, 9, 7}};
        ArrayList<Integer>list;
        list = sumTriangles(mat,3);
        System.out.println(list);
    }
}
