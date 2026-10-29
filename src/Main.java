import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] arr={2,2,7,7,8,7,8,8,3,2};
        System.out.println(findUniqueElement(arr));

        }
        public static int findUniqueElement(int[] arr){
            int result = 0;

            for (int bit = 0; bit < 32; bit++) {
                int count = 0;

                for (int num : arr) {
                    if (((num >> bit) & 1) == 1) {
                        count++;
                    }
                }

                if (count % 3 != 0) {
                    result |= (1 << bit);
                }
            }

            return result;
    }
}