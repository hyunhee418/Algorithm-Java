import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSortedArray {
    public int[] solution(int[] nums1, int m, int[] nums2, int n){
        for (int i=0; i<n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
