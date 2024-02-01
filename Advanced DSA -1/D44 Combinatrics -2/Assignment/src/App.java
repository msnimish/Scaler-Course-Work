import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(titleToNumber("AB"));
        pascalTriangle(4).toString();
    }
    public static int titleToNumber(String A) {
        StringBuilder sb = new StringBuilder(A);
        int base =26, pow = 0, colNo = 0;
        while(sb.length() > pow){
            Character ch = sb.charAt(sb.length() - pow - 1);
            colNo = colNo + (int)((int)(ch-'A'+1)*Math.pow(base,pow));
            pow++;
        }
        return colNo;
    }

    public static int[][] pascalTriangle(int A) {
        int[][] res = new int[A+1][A+1];
        for(int i =0 ;i<A;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    res[i][j] = 1;
                }else{
                    res[i][j] = res[i-1][j] + res[i-1][j-1];
                }
            }
        }
        for(int i=0;i<A;i++){
            for(int j=0; j<A;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        return res;
    }

    
}
