import java.util.ArrayList;
import java.util.Comparator;

public class findMedianSortedArraysTest {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int k : nums1) {
            list.add(k);
        }
        for (int j : nums2) {
            list.add(j);
        }
        list.sort(Comparator.comparing(Integer::intValue));
        if (list.size() % 2 == 0) {
            return (double) (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2;
        } else {
            return (double) list.get(list.size() / 2);
        }
    }
}
