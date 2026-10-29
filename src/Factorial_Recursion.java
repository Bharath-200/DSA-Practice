public class Factorial_Recursion {
    public static void main(String[] args) {
        int ans=prod(456587);
        System.out.println(ans);

    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*prod(n/10);
    }

}
