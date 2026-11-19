package RecursionProblems;

public class RemoveCharinString {
    public static void main(String[] args) {
        String a="baddcra";
        String b="baddcrappla";
        removeCharElementInString(a,"");
        System.out.println(removeCharElementInString2(a));
        System.out.println(skipApple(b));

    }
    static void removeCharElementInString(String a,String b) {
        if (a.isEmpty()) {
            System.out.println(b);
            return;
        }
        char ch = a.charAt(0);
        if(ch=='a'){
            removeCharElementInString(a.substring(1),b);
        }
        else{
            removeCharElementInString(a.substring(1),b+ch);
        }
    }

    static String removeCharElementInString2(String a) {
        if(a.isEmpty()){
            return "";
        }
        char ch = a.charAt(0);
        if(ch=='a'){
            return removeCharElementInString2(a.substring(1));
        }
        else {
            return ch+removeCharElementInString2(a.substring(1));
        }
    }
    static String skipApple(String a){
        if(a.isEmpty()){
            return "";
        }
        if(a.startsWith("app") && !a.startsWith("apple")){
            return a.substring(3);
        }
        else{
            return a.charAt(0)+skipApple(a.substring(1));
        }
    }


}
