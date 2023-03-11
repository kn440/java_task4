import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class HW4_1_Stepanova {
   


    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,78,90,2);

        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }

}
