import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(FindPrimeBySieve(7));

    }
    public static int[] FindPrimeBySieve(int A) {
        ArrayList res = new ArrayList<Integer>();
        boolean[] sieve = new boolean[A+1];

        for(int i=0;i<=A;i++){
            sieve[i] = true;
        }

        sieve[0] = false;
        sieve[1] = false;

        for(int i=2;i<=A;i++){
            if(sieve[i]){
                for(int j=i*i;j<=A;j+=i){
                    sieve[j] = false;
                }
            }
        }

        for(int i=0;i<=A;i++){
            if(sieve[i]){
                res.add(i);
            }
        }
        int[] ans = new int[res.size()+1];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = (int)res.get(i);
        }

        return ans;
    }
}
