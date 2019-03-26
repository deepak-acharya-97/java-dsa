package dp;

import java.util.Arrays;

import utility.Utilities.Utility;

public class DynamicProgramming {

	public static class LIS {
		public static int lis(int[] arr) {
			int length=arr.length;
			int[] lis = new int[length];
			Arrays.fill(lis, 1);
			for(int i=1; i<length; i++) {
				for(int j=0; j<i; j++) {
					if(arr[j]< arr[i] && lis[j] + 1 > lis[i]) {
						lis[i]=lis[j]+1;
					}
				}
			}
			return Utility.max(lis);
		}
	}

}
