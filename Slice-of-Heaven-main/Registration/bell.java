import java.util.*;

public class bell {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements");
        n=sc.nextInt();
        int[] nums = new int[10];
        for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
}
}