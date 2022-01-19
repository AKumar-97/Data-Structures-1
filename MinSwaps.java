//Program to find minimum swipes to ensure ordering in the array
public class MinSwaps {
	static int minimumSwaps(int[] arr) {
		int size = arr.length;
		int temp = 0;
		int countSize =0;
		for(int i=0;i<size;i++) {
			if(arr[i] == i+1) {
				continue;
			}
			else
			{
				temp = arr[i];
				arr[i] = arr[temp-1];
				arr[temp-1] = temp;
				countSize++;
				i--;
			}
		}
        return countSize;
    }
}
