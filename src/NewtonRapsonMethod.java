public class NewtonRapsonMethod {
    public static void main(String[] args) {

        System.out.println(NewtonRapsonMethod(5));

    }
    public static double NewtonRapsonMethod(int n){
        double root;
        double x=n;
        while (true){
            root=0.5 *(x+(n/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
