import java.util.*;

class fib{

    //memoizatoin technique:- this will take t(n)=>o(n) sc=>o(n)+o(n)
    // public static int fib(int n,List<Integer>r){

    //     if(n<=1) return n;

    //     if(r.size()>n && r.get(n)!=null)return r.get(n);  //checking for overlapping subprblm,

    //     int result= fib(n-1,r)+fib(n-2,r);       
    //     r.add(n,result);
    //     return result;

    // }

    //tabular technique:- tc=>o(n) sc=>o(n)+o(n)

    public static int fibo(int n){
        if(n<=1)return n;
        List<Integer>r=new ArrayList<>(n+1);

        r.add(0);
        r.add(1);
        for(int i=2;i<=n;i++){
            int f=r.get(i-1)+r.get(i-2);
            r.add(f);

        }

        return r.get(n);
        



    }


    //Space optimation 

    public static int spaceopt(int n){
        int prev2=0;
        int prev=1;
        int[]curr= new int[n+1];

        if(n<=1)return n;

        for(int i=2;i<=n;i++){
            curr[i]=prev+prev2;
            prev2=prev;
            prev=curr[i];
           
        }
        return prev;

    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(spaceopt(n));
        // List<Integer>r= new ArrayList<>(Collections.nCopies(n+1, null));
        // System.out.println(fib(n, r));
    }
}