package RecursionProblems;

import java.util.ArrayList;

public class SubSequenceArrayList {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(subSequenceArrayList(a,""));

    }
    static ArrayList<String> subSequenceArrayList(String up,String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char pre = up.charAt(0);
        ArrayList<String> left=subSequenceArrayList(up.substring(1),p+pre);
        ArrayList<String> right=subSequenceArrayList(up.substring(1),p);
        left.addAll(right);
        return left;

    }
}
