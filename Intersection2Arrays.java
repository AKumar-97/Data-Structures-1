// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection2Arrays {
		public int[] intersect(int[] nums1, int[] nums2) {
			HashMap<Integer,Integer> map = new HashMap<>();
			ArrayList<Integer> sol = new ArrayList<>();
			for(int i=0; i<nums1.length;i++) {
				if(map.containsKey(nums1[i])) {
					int newValue = map.get(nums1[i]);
					map.replace(nums1[i], (newValue + 1));
				}
				else
					map.put(nums1[i],1);
			}
			 
			int freq = 0;
			for(int i=0; i<nums2.length;i++) {
				if(map.containsKey(nums2[i])) {
					freq = map.get(nums2[i]);
					if(freq > 0) {
						sol.add(nums2[i]);
						map.replace(nums2[i], (map.get(nums2[i]) - 1));
					}

				}
			}
			
			int[] solution = new int[sol.size()];
			for(int i=0; i<sol.size();i++) {
				solution[i] = sol.get(i);
			}
			
			return solution;
        
    }
}
