import java.util.Arrays;
import java.util.HashMap;
    
    
class solution{
    public static int[] twosum(int[]nums,int target){

       
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){

        
            int diff= target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i ){
                return new int[]{map.get(diff),i};

            }
        }
        

        return nums;
    }
}
public class TwoSum {
    
    public static void main(String args[]) {
    
        int target = 17;
        int nums[] = {2, 7, 11, 15};
        nums = solution.twosum(nums, target);

        System.out.println(Arrays.toString(nums));
    }
}