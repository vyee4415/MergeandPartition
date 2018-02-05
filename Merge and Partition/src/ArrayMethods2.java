
public class ArrayMethods2 {
	
	public static String[ ] merge(String[] list1, String[] list2) {
		
	}
	public static int partition(int[] list) {
		int x = 0, y = list.length;
		while(x != y) {
			for(int i = 0; i < list.length; i++) {
				if(list[x]>list[y]) {
					
				}
			}
		}
	}
	
	public static void SwapInt(int[] arr, int index, int index2) {
		int x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
	public static void SwapDouble(double[] arr, int index, int index2) {
		double x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
	public static void SwapString(String[] arr, int index, int index2) {
		String x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
}
