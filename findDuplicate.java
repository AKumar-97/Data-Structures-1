import java.util.HashSet;
import java.util.Set;

//trick here is to not use Array and use nested for, with time complexity O(n)
// we should use HashSet set for storing elements


public class findDuplicate {
	 public static boolean containsDuplicate(int[] nums) {
	     Set<Integer> numbers = new HashSet<Integer>(); 
		 for(int number: nums)
	        {
	        	if(numbers.add(number) == false)
	        	{
	        		return true;
	        	}
	        }
		 return false;
	        
	    }
	 
	 public static void main(String[] args) {
		 int[] nums = {1,2,3,1};
		 System.out.println(containsDuplicate(nums));
		 int[] nums2 = {1,2,3,4};
		 System.out.println(containsDuplicate(nums2));
	 }
}
