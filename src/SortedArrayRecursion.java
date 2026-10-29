public class SortedArrayRecursion {
    public static void main(String[] args) {
        int arr[]={1,4,5,8,7};
        System.out.println(arrsort(arr,0));
    }

    private static boolean arrsort(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && arrsort(arr,index+1);

    }
}
