
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] solution = new int[2];
        //List solution = new ArrayList();
        //int i=0;
        int flag = 0;
        
        //solution with time O(n2)
		/*
		 * while(i<nums.length) { for(int j=i+1; j<nums.length;j++){ sum = nums[i] +
		 * nums[j]; if(sum == target){ flag = 1; solution[0] = i; solution[1] = j;
		 * break; } } if(flag == 1) break; i++; }
		 */
        
        
        //solution with time O(n)
        // we use HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length;i++) {
        	
        	if(map.containsKey(nums[i])) {
        		solution[0] = i;
        		solution[1] = map.get(nums[i]);
        	}
        	//putting the secondElement and at index i
        	map.put((target-nums[i]),i);
        	
        }
       
        return solution;
    }
}
